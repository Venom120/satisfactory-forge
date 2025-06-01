# Step-by-Step Workflow to Build Your Satisfactory Forge Modpack

## Step 1: Setup Development Environment
- Install **Java 17 JDK** (required by latest Forge)
- Install **Maven** (if using Maven) or **Gradle** (ForgeGradle uses Gradle by default)
- Install **IntelliJ IDEA** or **Eclipse** with Minecraft Forge support
- Clone/create your modpack repo with initial directory structure (from provided shell commands)

## Step 2: Configure Build Tool
- Set up `pom.xml` (Maven) or `build.gradle` (Gradle) with Forge MDK dependencies (target Minecraft 1.19+ recommended)
- Include basic Forge mod metadata in `mods.toml`
- Set up resource files: `pack.mcmeta`, basic lang files, textures folder structure

## Step 3: Create Base Mod Class
- Create main mod class (e.g., `SatisfactoryMod.java`) in `src/main/java/com/yatharth/satisfactory`
- Register mod ID, event bus, and logger
- Prepare basic event handlers (setup, client setup)

## Step 4: Implement Phase 1 Core Machines Skeleton
- Define machine blocks: Constructor, Assembler, Smelter, Biomass Burner
- Create basic TileEntity/BlockEntity classes for these machines
- Implement simple crafting recipe framework (2x2, 3x3 crafting inside machines)
- Set up MAM unlock gating (basic placeholder tech gating)
- Implement item IO interface skeleton for push/pull (no complex logistics yet)

## Step 5: Power System Basics
- Implement Biomass Burner as simple energy generator
- Create power grid system stub (power poles, wires with basic energy transfer)
- Implement simple power consumption for machines

## Step 6: Testing & Debugging
- Test placing machines, basic crafting, and power consumption in Minecraft environment
- Use debug logging and client UI placeholders to verify interactions
- Fix bugs and edge cases

## Step 7: Recipe & Tech Progression Locking
- Implement recipe gating system tied to MAM unlock progress
- Prevent machines from working until unlocked via milestone system
- Add simple GUI feedback for locked recipes/machines

## Step 8: Commit & Push to Repo
- Make regular commits with descriptive messages
- Push to GitHub and verify GitHub Actions build runs successfully

## Step 9: Plan Next Phase
- Review Phase 1 progress and bugs
- Design Phase 2 features (Conveyors, splitters, miners, etc.)
- Prepare for next development cycle

---

**Optional:**  
Throughout development, document decisions, design notes, and API contracts in the repo’s README or wiki for maintainability.
