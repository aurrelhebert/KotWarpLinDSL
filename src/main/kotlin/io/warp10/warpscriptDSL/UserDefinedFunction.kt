package io.warp10.warpscriptDSL
 
// 
// WarpScript KOTLINDSL
// @author aurrelhebert 
// @license apache 2.0 
// 
 
// Autogenerated code
 
fun WarpScript.cachedUdf(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("CUDF"), init) 
} 

fun WarpScript.cachedUdf(className: String, init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to className)
    return initTag(Functions("CUDF", data, HashMap(), this, emptyLambda), init) 
} 

fun WarpScript.cachedUdf(className: String? = null, classNameElements: Element.() -> Unit = emptyLambda, 
            init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to className)
    val elements = hashMapOf<Number, Element.() -> Unit>(1 to classNameElements)
    return initTag(Functions("CUDF", data, elements, this, emptyLambda), init) 
} 

fun WarpScript.call(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("CALL"), init) 
} 

fun WarpScript.udf(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("UDF"), init) 
} 

fun WarpScript.udf(className: String, init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to className)
    return initTag(Functions("UDF", data, HashMap(), this, emptyLambda), init) 
} 

fun WarpScript.udf(className: String? = null, classNameElements: Element.() -> Unit = emptyLambda, 
            init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to className)
    val elements = hashMapOf<Number, Element.() -> Unit>(1 to classNameElements)
    return initTag(Functions("UDF", data, elements, this, emptyLambda), init) 
} 
