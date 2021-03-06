package io.warp10.warpscriptDSL

//
// WarpScript KOTLINDSL
// @author aurrelhebert
// @license apache 2.0
//

//
// Class to call want to store WarpScript elements to re-use
//

class Store : FunctionElement {

    // Variable to store name attribute --> always in first position
    var saved: String
        get() = attributes[0]!!
        set(value) {
            attributes.put(0, value)
        }

    // Constructors
    fun setAttr(saved : String) {
        this.saved="\'" + saved + "\'"
    }

    constructor() : super("STORE")

    constructor(saved: String) : super("STORE") {
        this.saved="\'" + saved + "\'"
    }

    constructor(name: String, saved: String) : super(name) {
        this.saved="\'" + saved + "\'"
    }

}