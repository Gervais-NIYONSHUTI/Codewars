function incrementString(strng) {
  if (isNaN(Number(strng[strng.length - 1]))) return strng + 1;
  const str = [];
  let word = "", len
  for (let i = strng.length - 1; i >= 0; i--) {
    if (!isNaN(+strng[i])) {
      word = strng[i] + word;
      strng = strng.slice(0,i)
    } else {
      strng = strng.slice(0,i+1)
      break
    }
  }
  len = word.length
  word = (+word + 1) + ''
  if(word.length < len) for(let i = 0; i <= len - word.length; i++) word = '0' + word
  return strng + word;
}