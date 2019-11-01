package tw.scott.playground.another;

public class SomeDifficultModule {
    private String property001;
    private String property002;
    private String property003;
    private String property004;
    private String property005;
    private String property006;
    private String property007;
    private String property008;
    private String property009;
    private String property010;

    public static final class SomeDifficultModuleBuilder {
        private String property001;
        private String property002;
        private String property003;
        private String property004;
        private String property005;
        private String property006;
        private String property007;
        private String property008;
        private String property009;
        private String property010;

        private SomeDifficultModuleBuilder() {
        }

        public static SomeDifficultModuleBuilder aSomeDifficultModule() {
            return new SomeDifficultModuleBuilder();
        }

        public SomeDifficultModuleBuilder withProperty001(String property001) {
            this.property001 = property001;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty002(String property002) {
            this.property002 = property002;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty003(String property003) {
            this.property003 = property003;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty004(String property004) {
            this.property004 = property004;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty005(String property005) {
            this.property005 = property005;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty006(String property006) {
            this.property006 = property006;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty007(String property007) {
            this.property007 = property007;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty008(String property008) {
            this.property008 = property008;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty009(String property009) {
            this.property009 = property009;
            return this;
        }

        public SomeDifficultModuleBuilder withProperty010(String property010) {
            this.property010 = property010;
            return this;
        }

        public SomeDifficultModule build() {
            SomeDifficultModule someDifficultModule = new SomeDifficultModule();
            someDifficultModule.property004 = this.property004;
            someDifficultModule.property007 = this.property007;
            someDifficultModule.property009 = this.property009;
            someDifficultModule.property010 = this.property010;
            someDifficultModule.property008 = this.property008;
            someDifficultModule.property003 = this.property003;
            someDifficultModule.property006 = this.property006;
            someDifficultModule.property001 = this.property001;
            someDifficultModule.property002 = this.property002;
            someDifficultModule.property005 = this.property005;
            return someDifficultModule;
        }
    }
}
