package com.netflix.turbine.data;

import com.netflix.turbine.discovery.Instance;

/**
 * Cache key for
 *
 * @author Michael Rose <michael@fullcontact.com>
 */
public class InstanceCacheKey {
    private final Instance instance;

    public InstanceCacheKey(Instance instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InstanceCacheKey that = (InstanceCacheKey) o;

        if (instance != null ? !instance.equals(that.instance) : that.instance != null) return false;
        if (instance != null ? !instance.getAttributes().equals(that.instance.getAttributes()) : that.instance.getAttributes() != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = instance != null ? instance.hashCode() : 0;
        result = 31 * result + (instance != null ? instance.getAttributes().hashCode() : 0);
        return result;
    }
}
