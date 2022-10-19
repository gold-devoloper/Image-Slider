package gold.uz.pro.interfaces

import gold.uz.pro.constants.ActionTypes


/**
 * Created by Deniz Coşkun on 10/10/2020.
 * pro@hotmail.com
 * İstanbul
 */
interface TouchListener {
    /**
     * Click listener touched item function.
     *
     * @param  touched  slider boolean
     */
    fun onTouched(touched: ActionTypes)
}