function alphabetPosition(text) {
  text = text.toLowerCase()
  const alphabet = [
  'a', 'b', 'c', 'd', 'e', 'f',
  'g', 'h', 'i', 'j', 'k', 'l',
  'm', 'n', 'o', 'p', 'q', 'r',
  's', 't', 'u', 'v', 'w', 'x',
  'y', 'z'
];
return text.split('').map(val => alphabet.includes(val) ? +alphabet.indexOf(val) + 1 : 0).filter(val => val !== 0).join(' ')
}