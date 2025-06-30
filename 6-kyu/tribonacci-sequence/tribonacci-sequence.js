function tribonacci(signature,n){
  while(signature.length < n) signature.push(signature.slice(-3).reduce((ac, cr) => ac + cr))
  return signature.slice(0,n)
}