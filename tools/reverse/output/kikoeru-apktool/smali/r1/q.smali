.class public final Lr1/q;
.super Lr1/c;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final r:Lm4/d1;


# instance fields
.field public final d:Lr1/s;

.field public final e:F

.field public final f:F

.field public final g:Lr1/r;

.field public final h:[F

.field public final i:[F

.field public final j:[F

.field public final k:Lr1/i;

.field public final l:Lr1/p;

.field public final m:Lr1/m;

.field public final n:Lr1/i;

.field public final o:Lr1/p;

.field public final p:Lr1/m;

.field public final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm4/d1;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lm4/d1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lr1/q;->r:Lm4/d1;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Ljava/lang/String;[FLr1/s;DFFI)V
    .locals 17

    move-wide/from16 v1, p4

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 87
    sget-object v0, Lr1/q;->r:Lm4/d1;

    cmpg-double v5, v1, v3

    if-nez v5, :cond_0

    move-object v11, v0

    goto :goto_0

    .line 88
    :cond_0
    new-instance v3, Lr1/n;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v2, v4}, Lr1/n;-><init>(DI)V

    move-object v11, v3

    :goto_0
    if-nez v5, :cond_1

    :goto_1
    move-object v12, v0

    goto :goto_2

    .line 89
    :cond_1
    new-instance v0, Lr1/n;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lr1/n;-><init>(DI)V

    goto :goto_1

    .line 90
    :goto_2
    new-instance v15, Lr1/r;

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    const-wide/16 v5, 0x0

    move-object v0, v15

    invoke-direct/range {v0 .. v10}, Lr1/r;-><init>(DDDDD)V

    const/4 v10, 0x0

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v13, p6

    move/from16 v14, p7

    move/from16 v16, p8

    .line 91
    invoke-direct/range {v6 .. v16}, Lr1/q;-><init>(Ljava/lang/String;[FLr1/s;[FLr1/i;Lr1/i;FFLr1/r;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLr1/s;Lr1/r;I)V
    .locals 15

    move-object/from16 v9, p4

    .line 1
    iget-wide v0, v9, Lr1/r;->a:D

    const-wide/high16 v2, -0x3ff8000000000000L    # -3.0

    cmpg-double v4, v0, v2

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 2
    :goto_0
    iget-wide v5, v9, Lr1/r;->g:D

    iget-wide v7, v9, Lr1/r;->f:D

    const-wide/high16 v10, -0x4000000000000000L    # -2.0

    const-wide/16 v12, 0x0

    if-eqz v4, :cond_1

    .line 3
    new-instance v4, Lr1/o;

    const/4 v14, 0x4

    invoke-direct {v4, v9, v14}, Lr1/o;-><init>(Lr1/r;I)V

    goto :goto_1

    :cond_1
    cmpg-double v4, v0, v10

    if-nez v4, :cond_2

    .line 4
    new-instance v4, Lr1/o;

    const/4 v14, 0x5

    invoke-direct {v4, v9, v14}, Lr1/o;-><init>(Lr1/r;I)V

    goto :goto_1

    :cond_2
    cmpg-double v4, v7, v12

    if-nez v4, :cond_3

    cmpg-double v4, v5, v12

    if-nez v4, :cond_3

    .line 5
    new-instance v4, Lr1/o;

    const/4 v14, 0x6

    invoke-direct {v4, v9, v14}, Lr1/o;-><init>(Lr1/r;I)V

    goto :goto_1

    .line 6
    :cond_3
    new-instance v4, Lr1/o;

    const/4 v14, 0x7

    invoke-direct {v4, v9, v14}, Lr1/o;-><init>(Lr1/r;I)V

    :goto_1
    cmpg-double v14, v0, v2

    if-nez v14, :cond_4

    .line 7
    new-instance v0, Lr1/o;

    const/4 v1, 0x0

    invoke-direct {v0, v9, v1}, Lr1/o;-><init>(Lr1/r;I)V

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_4
    cmpg-double v2, v0, v10

    if-nez v2, :cond_5

    .line 8
    new-instance v0, Lr1/o;

    const/4 v1, 0x1

    invoke-direct {v0, v9, v1}, Lr1/o;-><init>(Lr1/r;I)V

    goto :goto_2

    :cond_5
    cmpg-double v0, v7, v12

    if-nez v0, :cond_6

    cmpg-double v0, v5, v12

    if-nez v0, :cond_6

    .line 9
    new-instance v0, Lr1/o;

    const/4 v1, 0x2

    invoke-direct {v0, v9, v1}, Lr1/o;-><init>(Lr1/r;I)V

    goto :goto_2

    .line 10
    :cond_6
    new-instance v0, Lr1/o;

    const/4 v1, 0x3

    invoke-direct {v0, v9, v1}, Lr1/o;-><init>(Lr1/r;I)V

    goto :goto_2

    :goto_3
    const/4 v7, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    move-object v5, v4

    const/4 v4, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v10, p5

    .line 11
    invoke-direct/range {v0 .. v10}, Lr1/q;-><init>(Ljava/lang/String;[FLr1/s;[FLr1/i;Lr1/i;FFLr1/r;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[FLr1/s;[FLr1/i;Lr1/i;FFLr1/r;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move/from16 v7, p8

    move/from16 v8, p10

    .line 12
    sget-wide v9, Lr1/b;->a:J

    move-object/from16 v11, p1

    invoke-direct {v0, v9, v10, v11, v8}, Lr1/c;-><init>(JLjava/lang/String;I)V

    .line 13
    iput-object v2, v0, Lr1/q;->d:Lr1/s;

    .line 14
    iput v6, v0, Lr1/q;->e:F

    .line 15
    iput v7, v0, Lr1/q;->f:F

    move-object/from16 v9, p9

    .line 16
    iput-object v9, v0, Lr1/q;->g:Lr1/r;

    .line 17
    iput-object v4, v0, Lr1/q;->k:Lr1/i;

    .line 18
    new-instance v9, Lr1/p;

    const/4 v10, 0x1

    invoke-direct {v9, v0, v10}, Lr1/p;-><init>(Lr1/q;I)V

    iput-object v9, v0, Lr1/q;->l:Lr1/p;

    .line 19
    new-instance v9, Lr1/m;

    const/4 v11, 0x0

    invoke-direct {v9, v0, v11}, Lr1/m;-><init>(Lr1/q;I)V

    iput-object v9, v0, Lr1/q;->m:Lr1/m;

    .line 20
    iput-object v5, v0, Lr1/q;->n:Lr1/i;

    .line 21
    new-instance v9, Lr1/p;

    invoke-direct {v9, v0, v11}, Lr1/p;-><init>(Lr1/q;I)V

    iput-object v9, v0, Lr1/q;->o:Lr1/p;

    .line 22
    new-instance v9, Lr1/m;

    invoke-direct {v9, v0, v10}, Lr1/m;-><init>(Lr1/q;I)V

    iput-object v9, v0, Lr1/q;->p:Lr1/m;

    .line 23
    array-length v9, v1

    const/16 v12, 0x9

    const/4 v13, 0x6

    if-eq v9, v13, :cond_1

    array-length v9, v1

    if-ne v9, v12, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 25
    const-string v2, "The color space\'s primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ"

    .line 26
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    cmpl-float v9, v6, v7

    if-gez v9, :cond_10

    .line 27
    new-array v9, v13, [F

    .line 28
    array-length v14, v1

    const/16 v15, 0x8

    const/16 v16, 0x7

    const/16 v17, 0x2

    const/16 v18, 0x3

    const/16 v19, 0x4

    const/16 v20, 0x5

    if-ne v14, v12, :cond_2

    .line 29
    aget v14, v1, v11

    aget v21, v1, v10

    add-float v22, v14, v21

    aget v23, v1, v17

    add-float v22, v22, v23

    div-float v14, v14, v22

    .line 30
    aput v14, v9, v11

    div-float v21, v21, v22

    .line 31
    aput v21, v9, v10

    .line 32
    aget v14, v1, v18

    aget v21, v1, v19

    add-float v22, v14, v21

    aget v23, v1, v20

    add-float v22, v22, v23

    div-float v14, v14, v22

    .line 33
    aput v14, v9, v17

    div-float v21, v21, v22

    .line 34
    aput v21, v9, v18

    .line 35
    aget v14, v1, v13

    aget v21, v1, v16

    add-float v22, v14, v21

    aget v1, v1, v15

    add-float v22, v22, v1

    div-float v14, v14, v22

    .line 36
    aput v14, v9, v19

    div-float v21, v21, v22

    .line 37
    aput v21, v9, v20

    goto :goto_1

    .line 38
    :cond_2
    invoke-static {v1, v11, v9, v11, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    :goto_1
    iput-object v9, v0, Lr1/q;->h:[F

    if-nez v3, :cond_3

    .line 40
    aget v3, v9, v11

    .line 41
    aget v14, v9, v10

    .line 42
    aget v21, v9, v17

    .line 43
    aget v22, v9, v18

    .line 44
    aget v23, v9, v19

    .line 45
    aget v24, v9, v20

    const/high16 p1, 0x3f800000    # 1.0f

    .line 46
    iget v1, v2, Lr1/s;->a:F

    const/16 p9, 0x0

    .line 47
    iget v11, v2, Lr1/s;->b:F

    const/16 v25, 0x8

    int-to-float v15, v10

    sub-float v26, v15, v3

    div-float v26, v26, v14

    sub-float v27, v15, v21

    div-float v27, v27, v22

    sub-float v28, v15, v23

    div-float v28, v28, v24

    sub-float/2addr v15, v1

    div-float/2addr v15, v11

    div-float v29, v3, v14

    div-float v30, v21, v22

    div-float v31, v23, v24

    div-float/2addr v1, v11

    sub-float v15, v15, v26

    sub-float v30, v30, v29

    mul-float v15, v15, v30

    sub-float v1, v1, v29

    sub-float v27, v27, v26

    mul-float v11, v1, v27

    sub-float/2addr v15, v11

    sub-float v28, v28, v26

    mul-float v28, v28, v30

    sub-float v31, v31, v29

    mul-float v27, v27, v31

    sub-float v28, v28, v27

    div-float v15, v15, v28

    mul-float v31, v31, v15

    sub-float v1, v1, v31

    div-float v1, v1, v30

    sub-float v11, p1, v1

    sub-float/2addr v11, v15

    div-float v26, v11, v14

    div-float v27, v1, v22

    div-float v28, v15, v24

    mul-float v29, v26, v3

    sub-float v3, p1, v3

    sub-float/2addr v3, v14

    mul-float v3, v3, v26

    mul-float v14, v27, v21

    sub-float v21, p1, v21

    sub-float v21, v21, v22

    mul-float v21, v21, v27

    mul-float v22, v28, v23

    sub-float v23, p1, v23

    sub-float v23, v23, v24

    mul-float v23, v23, v28

    .line 48
    new-array v12, v12, [F

    aput v29, v12, p9

    aput v11, v12, v10

    aput v3, v12, v17

    aput v14, v12, v18

    aput v1, v12, v19

    aput v21, v12, v20

    aput v22, v12, v13

    aput v15, v12, v16

    aput v23, v12, v25

    .line 49
    iput-object v12, v0, Lr1/q;->i:[F

    goto :goto_2

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    const/16 p9, 0x0

    .line 50
    array-length v1, v3

    if-ne v1, v12, :cond_f

    .line 51
    iput-object v3, v0, Lr1/q;->i:[F

    .line 52
    :goto_2
    iget-object v1, v0, Lr1/q;->i:[F

    invoke-static {v1}, Lr1/j;->f([F)[F

    move-result-object v1

    iput-object v1, v0, Lr1/q;->j:[F

    .line 53
    invoke-static {v9}, Lr1/j;->b([F)F

    move-result v1

    .line 54
    sget-object v3, Lr1/d;->a:[F

    .line 55
    sget-object v3, Lr1/d;->b:[F

    .line 56
    invoke-static {v3}, Lr1/j;->b([F)F

    move-result v3

    div-float/2addr v1, v3

    const v3, 0x3f666666    # 0.9f

    const/4 v11, 0x0

    cmpl-float v1, v1, v3

    if-lez v1, :cond_6

    .line 57
    sget-object v1, Lr1/d;->a:[F

    .line 58
    aget v3, v9, p9

    aget v12, v1, p9

    sub-float/2addr v3, v12

    .line 59
    aget v14, v9, v10

    aget v15, v1, v10

    sub-float/2addr v14, v15

    .line 60
    aget v16, v9, v17

    aget v21, v1, v17

    sub-float v16, v16, v21

    .line 61
    aget v22, v9, v18

    aget v23, v1, v18

    sub-float v22, v22, v23

    .line 62
    aget v24, v9, v19

    aget v25, v1, v19

    sub-float v24, v24, v25

    .line 63
    aget v26, v9, v20

    aget v1, v1, v20

    sub-float v26, v26, v1

    const/16 v27, 0x1

    new-array v10, v13, [F

    aput v3, v10, p9

    aput v14, v10, v27

    aput v16, v10, v17

    aput v22, v10, v18

    aput v24, v10, v19

    aput v26, v10, v20

    .line 64
    aget v3, v10, p9

    aget v14, v10, v27

    sub-float v16, v12, v25

    sub-float v22, v15, v1

    mul-float v22, v22, v3

    mul-float v16, v16, v14

    sub-float v22, v22, v16

    cmpg-float v16, v22, v11

    if-ltz v16, :cond_7

    sub-float v16, v12, v21

    sub-float v22, v15, v23

    mul-float v16, v16, v14

    mul-float v22, v22, v3

    sub-float v16, v16, v22

    cmpg-float v3, v16, v11

    if-gez v3, :cond_4

    goto :goto_3

    .line 65
    :cond_4
    aget v3, v10, v17

    aget v14, v10, v18

    sub-float v16, v21, v12

    sub-float v17, v23, v15

    mul-float v17, v17, v3

    mul-float v16, v16, v14

    sub-float v17, v17, v16

    cmpg-float v16, v17, v11

    if-ltz v16, :cond_7

    sub-float v16, v21, v25

    sub-float v17, v23, v1

    mul-float v16, v16, v14

    mul-float v17, v17, v3

    sub-float v16, v16, v17

    cmpg-float v3, v16, v11

    if-gez v3, :cond_5

    goto :goto_3

    .line 66
    :cond_5
    aget v3, v10, v19

    aget v10, v10, v20

    sub-float v14, v25, v21

    sub-float v16, v1, v23

    mul-float v16, v16, v3

    mul-float v14, v14, v10

    sub-float v16, v16, v14

    cmpg-float v14, v16, v11

    if-ltz v14, :cond_7

    sub-float v25, v25, v12

    sub-float/2addr v1, v15

    mul-float v25, v25, v10

    mul-float v1, v1, v3

    sub-float v25, v25, v1

    cmpg-float v1, v25, v11

    if-ltz v1, :cond_7

    goto :goto_4

    :cond_6
    const/16 v27, 0x1

    :cond_7
    :goto_3
    cmpg-float v1, v6, v11

    :goto_4
    if-nez v8, :cond_8

    goto/16 :goto_8

    .line 67
    :cond_8
    sget-object v1, Lr1/d;->a:[F

    if-ne v9, v1, :cond_9

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    :goto_5
    if-ge v3, v13, :cond_b

    .line 68
    aget v8, v9, v3

    aget v10, v1, v3

    invoke-static {v8, v10}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_a

    aget v8, v9, v3

    aget v10, v1, v3

    sub-float/2addr v8, v10

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    const v10, 0x3a83126f    # 0.001f

    cmpl-float v8, v8, v10

    if-lez v8, :cond_a

    goto :goto_9

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 69
    :cond_b
    :goto_6
    sget-object v1, Lr1/j;->d:Lr1/s;

    invoke-static {v2, v1}, Lr1/j;->d(Lr1/s;Lr1/s;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_9

    :cond_c
    cmpg-float v1, v6, v11

    if-nez v1, :cond_e

    cmpg-float v1, v7, p1

    if-nez v1, :cond_e

    .line 70
    sget-object v1, Lr1/d;->a:[F

    .line 71
    sget-object v1, Lr1/d;->e:Lr1/q;

    const-wide/16 v2, 0x0

    :goto_7
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    cmpg-double v8, v2, v6

    if-gtz v8, :cond_d

    .line 72
    iget-object v6, v1, Lr1/q;->k:Lr1/i;

    .line 73
    invoke-interface {v4, v2, v3}, Lr1/i;->c(D)D

    move-result-wide v7

    .line 74
    invoke-interface {v6, v2, v3}, Lr1/i;->c(D)D

    move-result-wide v9

    sub-double/2addr v7, v9

    .line 75
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3f50624dd2f1a9fcL    # 0.001

    cmpg-double v10, v6, v8

    if-gtz v10, :cond_e

    .line 76
    iget-object v6, v1, Lr1/q;->n:Lr1/i;

    .line 77
    invoke-interface {v5, v2, v3}, Lr1/i;->c(D)D

    move-result-wide v10

    .line 78
    invoke-interface {v6, v2, v3}, Lr1/i;->c(D)D

    move-result-wide v6

    sub-double/2addr v10, v6

    .line 79
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    cmpg-double v10, v6, v8

    if-gtz v10, :cond_e

    const-wide v6, 0x3f70101010101010L    # 0.00392156862745098

    add-double/2addr v2, v6

    goto :goto_7

    :cond_d
    :goto_8
    const/4 v10, 0x1

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v10, 0x0

    .line 80
    :goto_a
    iput-boolean v10, v0, Lr1/q;->q:Z

    return-void

    .line 81
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 82
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Transform must have 9 entries! Has "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v3, v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 83
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 84
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 85
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid range: min="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, ", max="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v3, "; min must be strictly < max"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 86
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(I)F
    .locals 0

    .line 1
    iget p1, p0, Lr1/q;->f:F

    .line 2
    .line 3
    return p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final b(I)F
    .locals 0

    .line 1
    iget p1, p0, Lr1/q;->e:F

    .line 2
    .line 3
    return p1
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr1/q;->q:Z

    .line 2
    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final d(FFF)J
    .locals 4

    .line 1
    float-to-double v0, p1

    .line 2
    iget-object p1, p0, Lr1/q;->p:Lr1/m;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Lr1/m;->c(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-float v0, v0

    .line 9
    float-to-double v1, p2

    .line 10
    invoke-virtual {p1, v1, v2}, Lr1/m;->c(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    double-to-float p2, v1

    .line 15
    float-to-double v1, p3

    .line 16
    invoke-virtual {p1, v1, v2}, Lr1/m;->c(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    double-to-float p1, v1

    .line 21
    iget-object p3, p0, Lr1/q;->i:[F

    .line 22
    .line 23
    array-length v1, p3

    .line 24
    const/16 v2, 0x9

    .line 25
    .line 26
    if-ge v1, v2, :cond_0

    .line 27
    .line 28
    const-wide/16 p1, 0x0

    .line 29
    .line 30
    return-wide p1

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    aget v1, p3, v1

    .line 33
    .line 34
    mul-float v1, v1, v0

    .line 35
    .line 36
    const/4 v2, 0x3

    .line 37
    aget v2, p3, v2

    .line 38
    .line 39
    mul-float v2, v2, p2

    .line 40
    .line 41
    add-float/2addr v2, v1

    .line 42
    const/4 v1, 0x6

    .line 43
    aget v1, p3, v1

    .line 44
    .line 45
    mul-float v1, v1, p1

    .line 46
    .line 47
    add-float/2addr v1, v2

    .line 48
    const/4 v2, 0x1

    .line 49
    aget v2, p3, v2

    .line 50
    .line 51
    mul-float v2, v2, v0

    .line 52
    .line 53
    const/4 v0, 0x4

    .line 54
    aget v0, p3, v0

    .line 55
    .line 56
    mul-float v0, v0, p2

    .line 57
    .line 58
    add-float/2addr v0, v2

    .line 59
    const/4 p2, 0x7

    .line 60
    aget p2, p3, p2

    .line 61
    .line 62
    mul-float p2, p2, p1

    .line 63
    .line 64
    add-float/2addr p2, v0

    .line 65
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    int-to-long v0, p1

    .line 70
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    int-to-long p1, p1

    .line 75
    const/16 p3, 0x20

    .line 76
    .line 77
    shl-long/2addr v0, p3

    .line 78
    const-wide v2, 0xffffffffL

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    and-long/2addr p1, v2

    .line 84
    or-long/2addr p1, v0

    .line 85
    return-wide p1
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final e(FFF)F
    .locals 3

    .line 1
    float-to-double v0, p1

    .line 2
    iget-object p1, p0, Lr1/q;->p:Lr1/m;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Lr1/m;->c(D)D

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    double-to-float v0, v0

    .line 9
    float-to-double v1, p2

    .line 10
    invoke-virtual {p1, v1, v2}, Lr1/m;->c(D)D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    double-to-float p2, v1

    .line 15
    float-to-double v1, p3

    .line 16
    invoke-virtual {p1, v1, v2}, Lr1/m;->c(D)D

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    double-to-float p1, v1

    .line 21
    const/4 p3, 0x2

    .line 22
    iget-object v1, p0, Lr1/q;->i:[F

    .line 23
    .line 24
    aget p3, v1, p3

    .line 25
    .line 26
    mul-float p3, p3, v0

    .line 27
    .line 28
    const/4 v0, 0x5

    .line 29
    aget v0, v1, v0

    .line 30
    .line 31
    mul-float v0, v0, p2

    .line 32
    .line 33
    add-float/2addr v0, p3

    .line 34
    const/16 p2, 0x8

    .line 35
    .line 36
    aget p2, v1, p2

    .line 37
    .line 38
    mul-float p2, p2, p1

    .line 39
    .line 40
    add-float/2addr p2, v0

    .line 41
    return p2
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_a

    .line 7
    .line 8
    const-class v2, Lr1/q;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-super {p0, p1}, Lr1/c;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-nez v2, :cond_2

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    check-cast p1, Lr1/q;

    .line 25
    .line 26
    iget-object v2, p1, Lr1/q;->g:Lr1/r;

    .line 27
    .line 28
    iget v3, p1, Lr1/q;->e:F

    .line 29
    .line 30
    iget v4, p0, Lr1/q;->e:F

    .line 31
    .line 32
    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    return v1

    .line 39
    :cond_3
    iget v3, p1, Lr1/q;->f:F

    .line 40
    .line 41
    iget v4, p0, Lr1/q;->f:F

    .line 42
    .line 43
    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    return v1

    .line 50
    :cond_4
    iget-object v3, p0, Lr1/q;->d:Lr1/s;

    .line 51
    .line 52
    iget-object v4, p1, Lr1/q;->d:Lr1/s;

    .line 53
    .line 54
    invoke-static {v3, v4}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    return v1

    .line 61
    :cond_5
    iget-object v3, p0, Lr1/q;->h:[F

    .line 62
    .line 63
    iget-object v4, p1, Lr1/q;->h:[F

    .line 64
    .line 65
    invoke-static {v3, v4}, Ljava/util/Arrays;->equals([F[F)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_6

    .line 70
    .line 71
    return v1

    .line 72
    :cond_6
    iget-object v3, p0, Lr1/q;->g:Lr1/r;

    .line 73
    .line 74
    if-eqz v3, :cond_7

    .line 75
    .line 76
    invoke-static {v3, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    return p1

    .line 81
    :cond_7
    if-nez v2, :cond_8

    .line 82
    .line 83
    return v0

    .line 84
    :cond_8
    iget-object v0, p0, Lr1/q;->k:Lr1/i;

    .line 85
    .line 86
    iget-object v2, p1, Lr1/q;->k:Lr1/i;

    .line 87
    .line 88
    invoke-static {v0, v2}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_9

    .line 93
    .line 94
    return v1

    .line 95
    :cond_9
    iget-object v0, p0, Lr1/q;->n:Lr1/i;

    .line 96
    .line 97
    iget-object p1, p1, Lr1/q;->n:Lr1/i;

    .line 98
    .line 99
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    return p1

    .line 104
    :cond_a
    :goto_0
    return v1
    .line 105
.end method

.method public final f(FFFFLr1/c;)J
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr1/q;->j:[F

    .line 3
    .line 4
    aget v0, v1, v0

    .line 5
    .line 6
    mul-float v0, v0, p1

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    aget v2, v1, v2

    .line 10
    .line 11
    mul-float v2, v2, p2

    .line 12
    .line 13
    add-float/2addr v2, v0

    .line 14
    const/4 v0, 0x6

    .line 15
    aget v0, v1, v0

    .line 16
    .line 17
    mul-float v0, v0, p3

    .line 18
    .line 19
    add-float/2addr v0, v2

    .line 20
    const/4 v2, 0x1

    .line 21
    aget v2, v1, v2

    .line 22
    .line 23
    mul-float v2, v2, p1

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    aget v3, v1, v3

    .line 27
    .line 28
    mul-float v3, v3, p2

    .line 29
    .line 30
    add-float/2addr v3, v2

    .line 31
    const/4 v2, 0x7

    .line 32
    aget v2, v1, v2

    .line 33
    .line 34
    mul-float v2, v2, p3

    .line 35
    .line 36
    add-float/2addr v2, v3

    .line 37
    const/4 v3, 0x2

    .line 38
    aget v3, v1, v3

    .line 39
    .line 40
    mul-float v3, v3, p1

    .line 41
    .line 42
    const/4 p1, 0x5

    .line 43
    aget p1, v1, p1

    .line 44
    .line 45
    mul-float p1, p1, p2

    .line 46
    .line 47
    add-float/2addr p1, v3

    .line 48
    const/16 p2, 0x8

    .line 49
    .line 50
    aget p2, v1, p2

    .line 51
    .line 52
    mul-float p2, p2, p3

    .line 53
    .line 54
    add-float/2addr p2, p1

    .line 55
    float-to-double v0, v0

    .line 56
    iget-object p1, p0, Lr1/q;->m:Lr1/m;

    .line 57
    .line 58
    invoke-virtual {p1, v0, v1}, Lr1/m;->c(D)D

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    double-to-float p3, v0

    .line 63
    float-to-double v0, v2

    .line 64
    invoke-virtual {p1, v0, v1}, Lr1/m;->c(D)D

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    double-to-float v0, v0

    .line 69
    float-to-double v1, p2

    .line 70
    invoke-virtual {p1, v1, v2}, Lr1/m;->c(D)D

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    double-to-float p1, p1

    .line 75
    invoke-static {p3, v0, p1, p4, p5}, Lq1/h0;->b(FFFFLr1/c;)J

    .line 76
    .line 77
    .line 78
    move-result-wide p1

    .line 79
    return-wide p1
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    invoke-super {p0}, Lr1/c;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object v1, p0, Lr1/q;->d:Lr1/s;

    .line 8
    .line 9
    invoke-virtual {v1}, Lr1/s;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    mul-int/lit8 v1, v1, 0x1f

    .line 15
    .line 16
    iget-object v0, p0, Lr1/q;->h:[F

    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Arrays;->hashCode([F)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/2addr v0, v1

    .line 23
    mul-int/lit8 v0, v0, 0x1f

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iget v2, p0, Lr1/q;->e:F

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    cmpg-float v4, v2, v3

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_0
    add-int/2addr v0, v2

    .line 40
    mul-int/lit8 v0, v0, 0x1f

    .line 41
    .line 42
    iget v2, p0, Lr1/q;->f:F

    .line 43
    .line 44
    cmpg-float v3, v2, v3

    .line 45
    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    :goto_1
    add-int/2addr v0, v2

    .line 55
    mul-int/lit8 v0, v0, 0x1f

    .line 56
    .line 57
    iget-object v2, p0, Lr1/q;->g:Lr1/r;

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {v2}, Lr1/r;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    :cond_2
    add-int/2addr v0, v1

    .line 66
    if-nez v2, :cond_3

    .line 67
    .line 68
    mul-int/lit8 v0, v0, 0x1f

    .line 69
    .line 70
    iget-object v1, p0, Lr1/q;->k:Lr1/i;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    mul-int/lit8 v1, v1, 0x1f

    .line 78
    .line 79
    iget-object v0, p0, Lr1/q;->n:Lr1/i;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    add-int/2addr v0, v1

    .line 86
    :cond_3
    return v0
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
.end method
