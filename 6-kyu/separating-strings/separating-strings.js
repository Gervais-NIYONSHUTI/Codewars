function sepStr(str) {
    str = str.split(' ')
    const max = Math.max(...str.map(val => val.length))
    const result = []
    for (let x = 0; x < max; x++){
      const item = []
      for(let i = 0; i<str.length; i++){
        str[i][x] ? item.push(str[i][x]) : item.push('')
      }
      result.push(item)
     }
    return result;
}