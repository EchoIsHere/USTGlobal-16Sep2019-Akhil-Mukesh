function first(){
    setTimeout(function(){
        console.log('first')
    },0)
}

function second(){
    console.log('second');
}

first();
second();