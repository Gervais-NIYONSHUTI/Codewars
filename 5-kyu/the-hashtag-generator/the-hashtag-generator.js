function generateHashtag (str) {
  str = str.split(' ').map(val => val.length >0 ? val[0].toUpperCase() + val.slice(1) : val).join('')
  if(str.length === 0 || str.length >= 140) return false
  return '#' + str
}