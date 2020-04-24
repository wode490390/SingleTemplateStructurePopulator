package cn.wode490390.nukkit.singletspop.populator;

import cn.nukkit.level.ChunkManager;
import cn.wode490390.nukkit.singletspop.template.ReadableStructureTemplate;

public interface CallbackableTemplateStructurePopulator {

    void generateChunkCallback(ReadableStructureTemplate template, int seed, ChunkManager level, int startChunkX, int startChunkZ, int y, int chunkX, int chunkZ);
}
