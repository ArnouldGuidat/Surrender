/*
Copyright (C) 2015  Arnould GUIDAT

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU Lesser General Public License as published by
the Free Software Foundation; version 3 of the License.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package fr.beaftech.surrender;

import java.util.Date;

/**
 * 
 * @author Arnould Guidat
 * @version 1.0
 * @since 1.0
 */
public interface CalendarModel {
	
	public Date getSelectedDate();
	
	public void setSelectedDate(Date date);
	
	public void addDay(int value);
	
	public void addMonth(int value);
	
	public void addYear(int value);
	
	public void addListener(CalendarListener l);
	
	public void removeListener(CalendarListener dl);

}
