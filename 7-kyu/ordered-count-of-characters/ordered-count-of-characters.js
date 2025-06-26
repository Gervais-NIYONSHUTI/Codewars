const orderedCount = function (text) {
  const arr = [...new Set(text.split(''))]
  return arr.map(v => [ v, text.split('').filter( s => s === v ).length ]);
}