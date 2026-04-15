.class public final Le5/h;
.super Le5/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final l:Ljava/lang/String;

.field public final m:Lya/i0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Le5/h;Ljava/lang/String;JIJLm4/n;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move-wide/from16 v6, p7

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-wide/from16 v11, p12

    move-wide/from16 v13, p14

    move/from16 v15, p16

    .line 4
    invoke-direct/range {v0 .. v15}, Le5/i;-><init>(Ljava/lang/String;Le5/h;JIJLm4/n;Ljava/lang/String;Ljava/lang/String;JJZ)V

    move-object/from16 v1, p3

    .line 5
    iput-object v1, v0, Le5/h;->l:Ljava/lang/String;

    .line 6
    invoke-static/range {p17 .. p17}, Lya/i0;->q(Ljava/util/Collection;)Lya/i0;

    move-result-object v1

    iput-object v1, v0, Le5/h;->m:Lya/i0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V
    .locals 19

    .line 1
    sget-object v0, Lya/i0;->b:Lya/g0;

    .line 2
    sget-object v18, Lya/a1;->e:Lya/a1;

    const/4 v3, 0x0

    .line 3
    const-string v4, ""

    const-wide/16 v5, 0x0

    const/4 v7, -0x1

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v10, 0x0

    const/16 v17, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v11, p2

    move-wide/from16 v13, p3

    move-wide/from16 v15, p5

    move-object/from16 v12, p7

    invoke-direct/range {v1 .. v18}, Le5/h;-><init>(Ljava/lang/String;Le5/h;Ljava/lang/String;JIJLm4/n;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    return-void
.end method
