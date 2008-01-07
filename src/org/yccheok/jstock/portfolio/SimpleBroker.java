/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2008 Cheok YanCheng <yccheok@yahoo.com>
 */

package org.yccheok.jstock.portfolio;

/**
 *
 * @author Owner
 */
public class SimpleBroker implements Broker {

    public SimpleBroker(String name, double maximumRate, double minimumRate, double rate) {        
        this.name = name;
        this.maximumRate = maximumRate;
        this.minimumRate = minimumRate;
        this.rate = rate;
    }
    
    public double calculate(Contract contact) {
        final double result = contact.getTotal() * getRate();
        if(result < getMinimumRate()) return getMinimumRate();
        if(result > getMaximumRate()) return getMaximumRate();
        
        return result;
    }

    private double maximumRate;
    private double minimumRate;
    private double rate;
    private String name;
    
    public double getMaximumRate() {
        return maximumRate;
    }

    public double getMinimumRate() {
        return minimumRate;
    }

    public double getRate() {
        return rate;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}