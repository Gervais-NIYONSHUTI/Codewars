function rotate(array, n) {
    n = n - (array.length*(Math.floor(n/array.length)))
    return n >= 0 ? [...array.slice(array.length - n),...array.slice(0,array.length - n)] : [ ...array.slice(-(n),array.length), ...array.slice(0,-(n))];
}