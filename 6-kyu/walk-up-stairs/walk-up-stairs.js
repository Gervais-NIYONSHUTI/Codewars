function stairs(n){
    let arr = []
    for(let i = 1; i <= n; i++) {
        let a = []
        for(let x = 1; x <=i; x++) a.push(`${x}`.slice(-1))
        arr.push( [...a,...a.reverse()].join(' '))
    }
    return arr.map(val => (' '.repeat(arr[arr.length - 1].length - val.length) + val)).join('\n')
}