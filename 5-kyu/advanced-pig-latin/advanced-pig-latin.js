function translate(sentence) {
  const sentenceArr = sentence.split(' ')
  const pattern = /[iuoae]/gi, punct = /[\.\!\?\,\;\:]/g
  for(let i in sentenceArr){
    let check = sentenceArr[i][0] === sentenceArr[i][0].toUpperCase()
    let p = ''
    sentenceArr[i].match(punct) === null ? p = '' : p = sentenceArr[i].match(punct).join('')
    sentenceArr[i] = sentenceArr[i].replaceAll(p, '')
    if(!isNaN(+sentenceArr[i])) continue
    if(sentenceArr[i].match(pattern) === null) {sentenceArr[i] = sentenceArr[i] + 'ay'}
    else if(sentenceArr[i][0].match(pattern) !== null) {sentenceArr[i] = sentenceArr[i] + 'way'}
    else{
      let va = ''
      for(let item of sentenceArr[i]) {
        if(item.match(pattern) === null){
          sentenceArr[i] = sentenceArr[i].slice(1) + item
        }else{ 
          break
        }
      }
      sentenceArr[i] += 'ay'
    }
    sentenceArr[i] = check ? sentenceArr[i][0].toUpperCase() + sentenceArr[i].slice(1).toLowerCase() + p : sentenceArr[i] + p
  }
  return sentenceArr.join(' ')
};