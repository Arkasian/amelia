/*
 * Copyright (C) 2017 zsel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.neology.controllers.input;




/**
 *
 * @author obsidiam
 */
public enum MouseStructure {
    X(0,0),
    Y(0,0),
    LOCATION(0,0);
    
    private int x,y;
    public boolean hasChanged = false;
 
    MouseStructure(int x, int y){
        this.x = x;
        this.y = y;
    }
 
    
    public void setLocation(int x , int y){
       this.x = x;
       this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
}
