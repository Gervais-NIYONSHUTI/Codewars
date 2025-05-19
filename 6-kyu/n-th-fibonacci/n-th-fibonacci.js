function nthFibo(n){
    const result = [0,1]
    while(result.length <= n) result.push(result.slice(-2).reduce((ac,cr)=> ac+cr))
    return result[n-1]
}