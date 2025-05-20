function longer(str){
    str = str.split(' ')
    return str.sort((a,b) =>{
        if(a.length !== b.length) {
            return a.length-b.length
        } else {
           if(a.charCodeAt(0) < 91){
            if(a.charCodeAt(0) < 91 && b.charCodeAt(0) < 91){
                for(let i in a){
                if(a[i] !== b[i]){
                    return  a.charCodeAt(i)-b.charCodeAt(i)
                }
            }
            }
            return a.charCodeAt(0)-b.charCodeAt(0)
           } else{
            for(let i in a){
                if(a[i] !== b[i]){
                    return  a.charCodeAt(i)-b.charCodeAt(i)
                }
            }
           }
        }
    }).join(' ')
}