var tbcal = "";
const useinp = document.getElementById('useinp');
const compinp = document.getElementById('compout');

function calcad(value) {
    tbcal += value;
    useinp.value = tbcal;
}

function removech() {
    tbcal = tbcal.substring(0, tbcal.length - 1);
    useinp.value = tbcal;
}

function execm() {
    if (tbcal.length == 0 || tbcal == "") {
        alert("NEEDS A INPUT");
        return;
    }
    try {
        ans = eval(tbcal);
    } catch (error) {
        alert("INVALID INPUT");
    }
}

function reset() {
    useinp.value = "";
    compinp.value = "";
    tbcal = "";
}