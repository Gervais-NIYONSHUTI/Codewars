function isVow(a){
    const vowels = [97, 101, 105, 111, 117, 65, 69, 73, 79, 85]
    return a.map(val=> vowels.includes(val)? String.fromCharCode(val): val)
}