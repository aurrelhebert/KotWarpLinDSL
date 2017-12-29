package io.warp10.warpscriptDSL
 
// 
// WarpScript KOTLINDSL
// @author aurrelhebert 
// @license apache 2.0 
// 
 
// Autogenerated code
 
fun WarpScript.dwtSplit(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("DWTSPLIT"), init) 
} 

fun WarpScript.dwtSplit(label: String, init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to label)
    return initTag(Functions("DWTSPLIT", data, HashMap(), this, emptyLambda), init) 
} 

fun WarpScript.dwtSplit(label: String? = null, labelElements: Element.() -> Unit = emptyLambda, 
            init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to label)
    val elements = hashMapOf<Number, Element.() -> Unit>(1 to labelElements)
    return initTag(Functions("DWTSPLIT", data, elements, this, emptyLambda), init) 
} 

fun WarpScript.fdwt(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("FDWT"), init) 
} 

fun WarpScript.fdwt(label: String, init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to label)
    return initTag(Functions("FDWT", data, HashMap(), this, emptyLambda), init) 
} 

fun WarpScript.fdwt(label: String? = null, labelElements: Element.() -> Unit = emptyLambda, 
            init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to label)
    val elements = hashMapOf<Number, Element.() -> Unit>(1 to labelElements)
    return initTag(Functions("FDWT", data, elements, this, emptyLambda), init) 
} 

fun WarpScript.fft(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("FFT"), init) 
} 

fun WarpScript.fftap(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("FFTAP"), init) 
} 

fun WarpScript.idwt(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("IDWT"), init) 
} 

fun WarpScript.idwt(label: String, init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to label)
    return initTag(Functions("IDWT", data, HashMap(), this, emptyLambda), init) 
} 

fun WarpScript.idwt(label: String? = null, labelElements: Element.() -> Unit = emptyLambda, 
            init: Element.() -> Unit = {}) : Functions {
    val data = hashMapOf<Number, Any?>(1 to label)
    val elements = hashMapOf<Number, Element.() -> Unit>(1 to labelElements)
    return initTag(Functions("IDWT", data, elements, this, emptyLambda), init) 
} 

fun WarpScript.ifft(init: Element.() -> Unit = {}) : Functions {
    return initTag(Functions("IFFT"), init) 
} 
