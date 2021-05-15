package com.example.sudoku.game

import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class SudokuGame {

    private var selectRow = -1
    private var selectColumn = -1

    private val blockSize = 3       //Block size = size of a block 3x3 = 3 cells on each direction
    private val boardSize = 9       //Board size = size of each direction = 9 cells

    //Dung de nhan select cell data live tu game
    var selectCellLiveData = MutableLiveData<Pair<Int, Int>>()
    var cellsLiveData = MutableLiveData<List<Cell>>()
    var highlightKeysLiveData = MutableLiveData<Set<Int>>()

    //Dung de tra ve gia tri live da hoan thanh game hay chua
    var isFinishedLiveData = MutableLiveData<Boolean>()

    //--------------------------------------------------------------------------------------------------------
    // INIT AND CELLS & BUTTONS & STATUS FUNCTION REGION
    //Khoi tao cell va live data
    init{

        selectCellLiveData.postValue(Pair(selectRow, selectColumn))
        isFinishedLiveData.postValue(false)
    }
}