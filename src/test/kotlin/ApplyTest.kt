
import io.warp10.warpscriptDSL.*
import org.junit.Test
import org.junit.Assert.*

class ApplyTest {

    @Test
    fun minimalApply() {
        var tmp = WarpScript.generate {
            allowVariableName(listOf("test"))
            apply(loadElements = { load("test")
                load("test")}, op = Apply().add())
        }
        val output = "[ \n  \$test \n  \$test \n  [] \n  op.add \n] \nAPPLY \n"
        assertEquals(output, tmp.toString())
    }

    @Test
    fun applyTestNativeElement() {
        var tmp = WarpScript.generate {
            allowVariableName(listOf("test"))
            apply(loadElements = { load("test")
                load("test")}, labels = listOf("test"), op = Apply().add())
        }
        val output = "[ \n  \$test \n  \$test \n  [ \'test\' ] \n  op.add \n] \nAPPLY \n"
        assertEquals(output, tmp.toString())
    }

    @Test()
    fun onlyWarpScriptExceptOp() {
        var tmp = WarpScript.generate {
            allowVariableName(listOf("test"))
            apply(loadElements = { load("test")
                load("test")}, labelsElements = { emptyList() }, op = Apply().add())
        }
        val output = "[ \n  \$test \n  \$test \n  [] \n  op.add \n] \nAPPLY \n"
        assertEquals(output, tmp.toString())
    }

    @Test()
    fun chainApplyWarpScript() {
        var tmp = WarpScript.generate {
            allowVariableName(listOf("test"))
            apply(loadElements = {
                apply(loadElements = { load("test")
                    load("test")}, labelsElements = {
                    emptyList()
                    addToExistingList(p2="label")
                }, op = Apply().add())
            }, op = Apply().mask())
        }
        val output = StringBuilder()
        output.append("[ \n")
        output.append("  [ \n")
        output.append("    \$test \n")
        output.append("    \$test \n")
        output.append("    [] \n")
        output.append("      \'label\' \n")
        output.append("    +! \n")
        output.append("    op.add \n")
        output.append("  ] \n")
        output.append("  APPLY \n")
        output.append("  [] \n")
        output.append("  op.mask \n")
        output.append("] \n")
        output.append("APPLY \n")
        assertEquals(output.toString(), tmp.toString())
    }

    @Test(expected = Exception::class)
    fun failMissingOp() {
        var tmp = WarpScript.generate {
            allowVariableName(listOf("test"))
            apply(loadElements = { load("test")
                load("test")}, labelsElements = { emptyList() })
        }
    }
}