package com.mygdx.game.actors;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ai.steer.Steerable;
import com.badlogic.gdx.ai.utils.Location;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.components.physics.PositionComponent;

public class TestPlayerSteering extends Steering implements Steerable<Vector2>, Updateable {
    protected ComponentMapper<PositionComponent> positionMap  = ComponentMapper.getFor(PositionComponent.class);

    public TestPlayerSteering(Vector2 position) { super(position); }

    public TestPlayerSteering(Entity entity) {
        super(entity);
    }

    @Override
    public void update(float delta) {
        PositionComponent posCom = positionMap.get(entity);

        position.x = posCom.x;
        position.y = posCom.y;
    }

    @Override
    public float getZeroLinearSpeedThreshold() {
        return 0;
    }

    @Override
    public void setZeroLinearSpeedThreshold(float value) {

    }

    @Override
    public void setOrientation(float orientation) {

    }

    @Override
    public Location<Vector2> newLocation() {
        return null;
    }
}
