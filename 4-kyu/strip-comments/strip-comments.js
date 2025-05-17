function solution(text, markers) {
    for(let val of markers) text = text.replaceAll(val, '|')
    let comment = false
    let result = []
    for ( let value of text){
        if(value === '|') comment = true
        if(value === '\n') comment = false
        if(comment === true) continue
        result.push(value)
    }
    return result.join('').split('\n').map(val => val.trimEnd()).join('\n')
}