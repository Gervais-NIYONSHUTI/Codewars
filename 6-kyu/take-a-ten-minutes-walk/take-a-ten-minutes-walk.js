function isValidWalk(walk) {
  let fun = d => walk.filter(v => v===d).length
  return fun('n') === fun('s') && fun('e') === fun('w') && walk.length === 10
}