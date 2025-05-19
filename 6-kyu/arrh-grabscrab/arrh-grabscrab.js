function grabscrab(anagram, dictionary) {
  let result = []
    for(let word of dictionary){
        let wordCopy = word
        for(let char of anagram) if(word.includes(char) && wordCopy.length === anagram.length) word = word.replace(char,'')
        if(word.length === 0) result.push(wordCopy)
    }
    return result
}