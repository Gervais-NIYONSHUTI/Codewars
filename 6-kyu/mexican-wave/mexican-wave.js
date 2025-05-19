function wave(str){
    const result = []
    for(let i = 0; i < str.length; i++) {
        let newValue = ''
        if(str[i] === ' ') continue
        for(let x = 0; x < str.length; x++) x === i ? newValue += str[x].toUpperCase() : newValue += str[x]
        result.push(newValue)
    }
    return result
}