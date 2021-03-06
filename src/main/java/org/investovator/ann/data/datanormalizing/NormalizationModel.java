/*
 * investovator, Stock Market Gaming Framework
 *     Copyright (C) 2013  investovator
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.investovator.ann.data.datanormalizing;

import java.io.Serializable;

/**
 * @author: Hasala Surasinghe
 * @author: Amila Surendra
 * @version: ${Revision}
 */
public class NormalizationModel implements Serializable {

    private double oldMax;
    private double newMax;
    private double oldMin;
    private double newMin;

    public NormalizationModel(){

    }

    public double getOldMax() {
        return oldMax;
    }

    public void setOldMax(double oldMax) {
        this.oldMax = oldMax;
    }

    public double getNewMax() {
        return newMax;
    }

    public void setNewMax(double newMax) {
        this.newMax = newMax;
    }

    public double getOldMin() {
        return oldMin;
    }

    public void setOldMin(double oldMin) {
        this.oldMin = oldMin;
    }

    public double getNewMin() {
        return newMin;
    }

    public void setNewMin(double newMin) {
        this.newMin = newMin;
    }
}
