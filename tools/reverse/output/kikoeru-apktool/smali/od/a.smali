.class public final Lod/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lre/o;

.field public final b:Ldd/b;

.field public final c:Ldd/b;

.field public final d:Lud/g;

.field public final e:Lmd/h;

.field public final f:Loe/m;

.field public final g:Lmd/h;

.field public final h:Lmd/h;

.field public final i:Lg5/w;

.field public final j:Ldd/e;

.field public final k:Li7/p2;

.field public final l:Lud/h;

.field public final m:Lyc/n0;

.field public final n:Lgd/a;

.field public final o:Lyc/y;

.field public final p:Lvc/m;

.field public final q:Lld/b;

.field public final r:Ltd/c;

.field public final s:Lld/l;

.field public final t:Lod/b;

.field public final u:Lte/k;

.field public final v:Lb7/n;

.field public final w:Lud/h;

.field public final x:Lje/e;


# direct methods
.method public constructor <init>(Lre/o;Ldd/b;Ldd/b;Lud/g;Lmd/h;Loe/m;Lmd/h;Lg5/w;Ldd/e;Li7/p2;Lud/h;Lyc/n0;Lgd/a;Lyc/y;Lvc/m;Lld/b;Ltd/c;Lld/l;Lod/b;Lte/k;Lb7/n;Lud/h;)V
    .locals 17

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    sget-object v0, Lmd/h;->b:Lmd/h;

    .line 1
    sget-object v16, Lje/e;->a:Lje/d;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v16, v0

    .line 2
    const-string v0, "storageManager"

    invoke-static {v1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {v2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v7, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v8, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v9, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v10, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v11, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v12, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v13, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v14, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    sget-object v15, Lje/d;->b:Lje/a;

    invoke-static {v15, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 4
    iput-object v1, v0, Lod/a;->a:Lre/o;

    .line 5
    iput-object v2, v0, Lod/a;->b:Ldd/b;

    .line 6
    iput-object v3, v0, Lod/a;->c:Ldd/b;

    .line 7
    iput-object v4, v0, Lod/a;->d:Lud/g;

    .line 8
    iput-object v5, v0, Lod/a;->e:Lmd/h;

    .line 9
    iput-object v6, v0, Lod/a;->f:Loe/m;

    move-object/from16 v1, v16

    .line 10
    iput-object v1, v0, Lod/a;->g:Lmd/h;

    .line 11
    iput-object v7, v0, Lod/a;->h:Lmd/h;

    .line 12
    iput-object v8, v0, Lod/a;->i:Lg5/w;

    .line 13
    iput-object v9, v0, Lod/a;->j:Ldd/e;

    .line 14
    iput-object v10, v0, Lod/a;->k:Li7/p2;

    .line 15
    iput-object v11, v0, Lod/a;->l:Lud/h;

    .line 16
    iput-object v12, v0, Lod/a;->m:Lyc/n0;

    .line 17
    iput-object v13, v0, Lod/a;->n:Lgd/a;

    .line 18
    iput-object v14, v0, Lod/a;->o:Lyc/y;

    move-object/from16 v1, p15

    .line 19
    iput-object v1, v0, Lod/a;->p:Lvc/m;

    move-object/from16 v1, p16

    .line 20
    iput-object v1, v0, Lod/a;->q:Lld/b;

    move-object/from16 v1, p17

    .line 21
    iput-object v1, v0, Lod/a;->r:Ltd/c;

    move-object/from16 v1, p18

    .line 22
    iput-object v1, v0, Lod/a;->s:Lld/l;

    move-object/from16 v1, p19

    .line 23
    iput-object v1, v0, Lod/a;->t:Lod/b;

    move-object/from16 v1, p20

    .line 24
    iput-object v1, v0, Lod/a;->u:Lte/k;

    move-object/from16 v1, p21

    .line 25
    iput-object v1, v0, Lod/a;->v:Lb7/n;

    move-object/from16 v1, p22

    .line 26
    iput-object v1, v0, Lod/a;->w:Lud/h;

    .line 27
    iput-object v15, v0, Lod/a;->x:Lje/e;

    return-void
.end method
