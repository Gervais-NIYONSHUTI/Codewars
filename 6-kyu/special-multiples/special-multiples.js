function countSpecMult(n, mxval) {
    let prime = [], i = 2, result = []
    while(prime.length < n){
      let check = true
      for(let x = 2;x < i; x++) if(i%x ===0) check = false
      if(check) prime.push(i)
      i++
    }
    product = prime.reduce((ac, cr) => ac*cr)
  let add = product
  while(product < mxval) {
    result.push(product)
    product += add
  }
  return result.length
}