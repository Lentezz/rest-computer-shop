package com.shop.restcomputershop.util;

import com.shop.restcomputershop.dto.Desktop;
import com.shop.restcomputershop.dto.MonoBlock;
import com.shop.restcomputershop.dto.Laptop;
import com.shop.restcomputershop.entity.DesktopEntity;
import com.shop.restcomputershop.entity.MonoBlockEntity;
import com.shop.restcomputershop.entity.LaptopEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    public Desktop convert(DesktopEntity desktopEntity){
        Desktop desktop;
        if(desktopEntity instanceof MonoBlockEntity)
            desktop = new MonoBlock();
        else if(desktopEntity instanceof LaptopEntity)
            desktop = new Laptop();
        else desktop = new Desktop();
        BeanUtils.copyProperties(desktopEntity, desktop);
        return desktop;
    }

    public DesktopEntity convert(Desktop desktop){
        DesktopEntity desktopEntity;
        if(desktop instanceof MonoBlock)
            desktopEntity = new MonoBlockEntity();
        else if( desktop instanceof Laptop)
            desktopEntity = new LaptopEntity();
        else desktopEntity = new DesktopEntity();
        BeanUtils.copyProperties(desktop, desktopEntity);
        return desktopEntity;
    }
}
