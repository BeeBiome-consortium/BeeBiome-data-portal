package org.beebiome.dataportal.api.core.service;

import org.beebiome.dataportal.api.core.model.Entity;

import java.util.List;

public interface EntityService {

    public List<Entity> getAllEntities();

    public List<Entity> getEntitiesByBiosampleAcc(String id);

    public List<Entity> getEntities(String biosampleAcc, String bioProjectAcc, String assayTypes,
                                    String centerName, String instruments, String libraryLayouts,
                                    String librarySources, String organism, String host,
                                    String geoLocName, String collectionDate);

}
