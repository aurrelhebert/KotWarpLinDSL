package io.warp10.warpscriptDSL

//
// WarpScript KOTLINDSL
// @author aurrelhebert
// @license apache 2.0
//

class FilterFunction : FunctionElement {

    constructor(name: String) : super(name)

    constructor(name: String, attributes: Map<Number, String>) : super(name) {
        this.attributes.putAll(attributes)
    }

    fun setAttributes(index: Long, value: String) {
        this.attributes.put(index, value)
    }

}