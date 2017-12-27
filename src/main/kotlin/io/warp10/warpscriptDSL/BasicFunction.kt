package io.warp10.warpscriptDSL
 
// 
// WarpScript KOTLINDSL
// @author aurrelhebert 
// @license apache 2.0 
// 
 
// Autogenerated code
 
fun WarpScript.add(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("+"), init) 
} 

fun WarpScript.add(p1: Any, p2: Any, init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any>(0 to p1, 1 to p2)
    return initTag(Functions("+", data, HashMap(), this, emptyLambda), init) 
} 

fun WarpScript.add(p1: Any, p1Elements: Element.() -> Unit = emptyLambda, 
            p2: Any, p2Elements: Element.() -> Unit = emptyLambda, 
            init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any>(0 to p1, 1 to p2)
    val elements = hashMapOf<Number, Element.() -> Unit>(0 to p1Elements, 1 to p2Elements)
    return initTag(Functions("+", data, elements, this, emptyLambda), init) 
} 

fun WarpScript.drop(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("DROP"), init) 
} 

fun WarpScript.now(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("NOW"), init) 
} 

fun WarpScript.swap(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("SWAP"), init) 
} 
