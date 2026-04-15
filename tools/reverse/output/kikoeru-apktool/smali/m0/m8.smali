.class public abstract Lm0/m8;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lm0/m8;->a:F

    .line 5
    .line 6
    const/16 v0, 0xc

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    sput v0, Lm0/m8;->b:F

    .line 10
    .line 11
    return-void
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

.method public static final a(Lm0/w8;Ljava/lang/String;Lic/n;Ly2/g0;Lic/n;Lic/n;Lic/n;Lic/n;ZZZLw/k;Ly/d1;Lq1/l0;Lm0/x1;Lic/n;Lx0/o;II)V
    .locals 31

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v15, p14

    move-object/from16 v0, p16

    move/from16 v1, p17

    move/from16 v3, p18

    const/4 v6, 0x0

    .line 1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const v8, 0x18f3769a

    .line 2
    invoke-virtual {v0, v8}, Lx0/o;->Y(I)Lx0/o;

    and-int/lit8 v8, v1, 0x6

    if-nez v8, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v0, v8}, Lx0/o;->d(I)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_1
    move v8, v1

    :goto_1
    and-int/lit8 v14, v1, 0x30

    const/16 v16, 0x10

    if-nez v14, :cond_3

    invoke-virtual {v0, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    const/16 v14, 0x20

    goto :goto_2

    :cond_2
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v8, v14

    :cond_3
    and-int/lit16 v14, v1, 0x180

    const/16 v18, 0x80

    const/16 v19, 0x100

    if-nez v14, :cond_5

    move-object/from16 v14, p2

    invoke-virtual {v0, v14}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_4

    const/16 v20, 0x100

    goto :goto_3

    :cond_4
    const/16 v20, 0x80

    :goto_3
    or-int v8, v8, v20

    goto :goto_4

    :cond_5
    move-object/from16 v14, p2

    :goto_4
    and-int/lit16 v13, v1, 0xc00

    const/16 v21, 0x400

    if-nez v13, :cond_7

    invoke-virtual {v0, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/16 v13, 0x800

    goto :goto_5

    :cond_6
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v8, v13

    :cond_7
    and-int/lit16 v13, v1, 0x6000

    const/16 v22, 0x2000

    const/16 v23, 0x4000

    if-nez v13, :cond_9

    invoke-virtual {v0, v5}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x4000

    goto :goto_6

    :cond_8
    const/16 v13, 0x2000

    :goto_6
    or-int/2addr v8, v13

    :cond_9
    const/high16 v13, 0x30000

    and-int v24, v1, v13

    const/high16 v25, 0x10000

    const/high16 v26, 0x20000

    move-object/from16 v13, p5

    if-nez v24, :cond_b

    const/high16 v24, 0x30000

    invoke-virtual {v0, v13}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_a

    const/high16 v27, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v27, 0x10000

    :goto_7
    or-int v8, v8, v27

    goto :goto_8

    :cond_b
    const/high16 v24, 0x30000

    :goto_8
    const/high16 v27, 0x180000

    and-int v27, v1, v27

    move-object/from16 v6, p6

    if-nez v27, :cond_d

    invoke-virtual {v0, v6}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    const/high16 v28, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v28, 0x80000

    :goto_9
    or-int v8, v8, v28

    :cond_d
    const/high16 v28, 0xc00000

    and-int v28, v1, v28

    move-object/from16 v9, p7

    if-nez v28, :cond_f

    invoke-virtual {v0, v9}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_e

    const/high16 v29, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v29, 0x400000

    :goto_a
    or-int v8, v8, v29

    :cond_f
    const/high16 v29, 0x6000000

    and-int v29, v1, v29

    move/from16 v1, p8

    if-nez v29, :cond_11

    invoke-virtual {v0, v1}, Lx0/o;->g(Z)Z

    move-result v29

    if-eqz v29, :cond_10

    const/high16 v29, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v29, 0x2000000

    :goto_b
    or-int v8, v8, v29

    :cond_11
    const/high16 v29, 0x30000000

    and-int v29, p17, v29

    if-nez v29, :cond_13

    invoke-virtual {v0, v10}, Lx0/o;->g(Z)Z

    move-result v29

    if-eqz v29, :cond_12

    const/high16 v29, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v29, 0x10000000

    :goto_c
    or-int v8, v8, v29

    :cond_13
    and-int/lit8 v29, v3, 0x6

    if-nez v29, :cond_15

    invoke-virtual {v0, v11}, Lx0/o;->g(Z)Z

    move-result v29

    if-eqz v29, :cond_14

    const/16 v17, 0x4

    goto :goto_d

    :cond_14
    const/16 v17, 0x2

    :goto_d
    or-int v17, v3, v17

    goto :goto_e

    :cond_15
    move/from16 v17, v3

    :goto_e
    and-int/lit8 v20, v3, 0x30

    if-nez v20, :cond_17

    invoke-virtual {v0, v12}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/16 v16, 0x20

    :cond_16
    or-int v17, v17, v16

    :cond_17
    and-int/lit16 v1, v3, 0x180

    if-nez v1, :cond_19

    move-object/from16 v1, p12

    invoke-virtual {v0, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_18

    const/16 v18, 0x100

    :cond_18
    or-int v17, v17, v18

    goto :goto_f

    :cond_19
    move-object/from16 v1, p12

    :goto_f
    and-int/lit16 v1, v3, 0xc00

    if-nez v1, :cond_1b

    move-object/from16 v1, p13

    invoke-virtual {v0, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    const/16 v21, 0x800

    :cond_1a
    or-int v17, v17, v21

    goto :goto_10

    :cond_1b
    move-object/from16 v1, p13

    :goto_10
    and-int/lit16 v1, v3, 0x6000

    if-nez v1, :cond_1d

    invoke-virtual {v0, v15}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1c

    const/16 v22, 0x4000

    :cond_1c
    or-int v17, v17, v22

    :cond_1d
    and-int v1, v3, v24

    if-nez v1, :cond_1f

    move-object/from16 v1, p15

    invoke-virtual {v0, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1e

    const/high16 v25, 0x20000

    :cond_1e
    or-int v17, v17, v25

    goto :goto_11

    :cond_1f
    move-object/from16 v1, p15

    :goto_11
    const v16, 0x12492493

    and-int v1, v8, v16

    const v3, 0x12492492

    const/16 v16, 0x1

    if-ne v1, v3, :cond_21

    const v1, 0x12493

    and-int v1, v17, v1

    const v3, 0x12492

    if-eq v1, v3, :cond_20

    goto :goto_12

    :cond_20
    const/4 v1, 0x0

    goto :goto_13

    :cond_21
    :goto_12
    const/4 v1, 0x1

    :goto_13
    and-int/lit8 v3, v8, 0x1

    invoke-virtual {v0, v3, v1}, Lx0/o;->N(IZ)Z

    move-result v1

    if-eqz v1, :cond_30

    and-int/lit8 v1, v8, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_22

    const/4 v1, 0x1

    goto :goto_14

    :cond_22
    const/4 v1, 0x0

    :goto_14
    and-int/lit16 v3, v8, 0x1c00

    const/16 v8, 0x800

    if-ne v3, v8, :cond_23

    const/4 v3, 0x1

    goto :goto_15

    :cond_23
    const/4 v3, 0x0

    :goto_15
    or-int/2addr v1, v3

    .line 3
    invoke-virtual {v0}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_24

    .line 4
    sget-object v1, Lx0/k;->a:Lx0/r0;

    if-ne v3, v1, :cond_25

    .line 5
    :cond_24
    new-instance v1, Lt2/g;

    invoke-direct {v1, v2}, Lt2/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ly2/g0;->a(Lt2/g;)Ly2/d0;

    move-result-object v3

    .line 6
    invoke-virtual {v0, v3}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 7
    :cond_25
    check-cast v3, Ly2/d0;

    .line 8
    iget-object v1, v3, Ly2/d0;->a:Lt2/g;

    .line 9
    iget-object v8, v1, Lt2/g;->b:Ljava/lang/String;

    shr-int/lit8 v1, v17, 0x3

    and-int/lit8 v1, v1, 0xe

    .line 10
    invoke-static {v12, v0, v1}, Lud/b;->i(Lw/k;Lx0/o;I)Lx0/w0;

    move-result-object v1

    invoke-interface {v1}, Lx0/n2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_26

    .line 11
    sget-object v1, Lm0/s3;->a:Lm0/s3;

    goto :goto_16

    .line 12
    :cond_26
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lm0/s3;->b:Lm0/s3;

    goto :goto_16

    .line 13
    :cond_27
    sget-object v1, Lm0/s3;->c:Lm0/s3;

    .line 14
    :goto_16
    new-instance v3, Lm0/c8;

    invoke-direct {v3, v15, v10, v11, v12}, Lm0/c8;-><init>(Lm0/x1;ZZLw/k;)V

    .line 15
    sget-object v2, Lm0/e9;->b:Lx0/o2;

    .line 16
    invoke-virtual {v0, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v17

    .line 17
    move-object/from16 v4, v17

    check-cast v4, Lm0/d9;

    .line 18
    iget-object v5, v4, Lm0/d9;->g:Lt2/l0;

    .line 19
    iget-object v4, v4, Lm0/d9;->l:Lt2/l0;

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    .line 20
    invoke-virtual/range {v17 .. v17}, Lt2/l0;->b()J

    move-result-wide v4

    move-object/from16 v19, v8

    .line 21
    sget-wide v8, Lq1/q;->h:J

    .line 22
    invoke-static {v4, v5, v8, v9}, Lq1/q;->c(JJ)Z

    move-result v4

    if-eqz v4, :cond_28

    invoke-virtual/range {v18 .. v18}, Lt2/l0;->b()J

    move-result-wide v4

    invoke-static {v4, v5, v8, v9}, Lq1/q;->c(JJ)Z

    move-result v4

    if-eqz v4, :cond_29

    .line 23
    :cond_28
    invoke-virtual/range {v17 .. v17}, Lt2/l0;->b()J

    move-result-wide v4

    invoke-static {v4, v5, v8, v9}, Lq1/q;->c(JJ)Z

    move-result v4

    if-nez v4, :cond_2a

    invoke-virtual/range {v18 .. v18}, Lt2/l0;->b()J

    move-result-wide v4

    invoke-static {v4, v5, v8, v9}, Lq1/q;->c(JJ)Z

    move-result v4

    if-eqz v4, :cond_2a

    :cond_29
    const/16 v20, 0x1

    goto :goto_17

    :cond_2a
    const/16 v20, 0x0

    .line 24
    :goto_17
    sget-object v4, Lm0/b3;->b:Lm0/b3;

    const v5, -0x560ed133

    .line 25
    invoke-virtual {v0, v5}, Lx0/o;->W(I)V

    .line 26
    invoke-virtual {v0, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v5

    .line 27
    check-cast v5, Lm0/d9;

    .line 28
    iget-object v5, v5, Lm0/d9;->l:Lt2/l0;

    .line 29
    invoke-virtual {v5}, Lt2/l0;->b()J

    move-result-wide v8

    const-wide/16 v17, 0x10

    if-eqz v20, :cond_2c

    const v5, -0x34ecb6db    # -9652517.0f

    .line 30
    invoke-virtual {v0, v5}, Lx0/o;->W(I)V

    cmp-long v5, v8, v17

    if-eqz v5, :cond_2b

    :goto_18
    const/4 v5, 0x0

    goto :goto_19

    :cond_2b
    invoke-virtual {v3, v1, v0, v7}, Lm0/c8;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq1/q;

    .line 31
    iget-wide v8, v5, Lq1/q;->a:J

    goto :goto_18

    .line 32
    :goto_19
    invoke-virtual {v0, v5}, Lx0/o;->p(Z)V

    move-object/from16 v22, v4

    :goto_1a
    move-wide/from16 v23, v8

    goto :goto_1b

    :cond_2c
    move-object/from16 v22, v4

    const/4 v5, 0x0

    const v4, 0x489d8dbc    # 322669.88f

    .line 33
    invoke-virtual {v0, v4}, Lx0/o;->W(I)V

    .line 34
    invoke-virtual {v0, v5}, Lx0/o;->p(Z)V

    goto :goto_1a

    .line 35
    :goto_1b
    invoke-virtual {v0, v5}, Lx0/o;->p(Z)V

    const v4, -0x560eb4d1

    .line 36
    invoke-virtual {v0, v4}, Lx0/o;->W(I)V

    .line 37
    invoke-virtual {v0, v2}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v2

    .line 38
    check-cast v2, Lm0/d9;

    .line 39
    iget-object v2, v2, Lm0/d9;->g:Lt2/l0;

    .line 40
    invoke-virtual {v2}, Lt2/l0;->b()J

    move-result-wide v4

    if-eqz v20, :cond_2e

    const v2, -0x3d32695a

    .line 41
    invoke-virtual {v0, v2}, Lx0/o;->W(I)V

    cmp-long v2, v4, v17

    if-eqz v2, :cond_2d

    :goto_1c
    const/4 v2, 0x0

    goto :goto_1d

    :cond_2d
    invoke-virtual {v3, v1, v0, v7}, Lm0/c8;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq1/q;

    .line 42
    iget-wide v4, v2, Lq1/q;->a:J

    goto :goto_1c

    .line 43
    :goto_1d
    invoke-virtual {v0, v2}, Lx0/o;->p(Z)V

    :goto_1e
    move-wide/from16 v25, v4

    goto :goto_1f

    :cond_2e
    const/4 v2, 0x0

    const v7, 0x2f930c1b

    .line 44
    invoke-virtual {v0, v7}, Lx0/o;->W(I)V

    .line 45
    invoke-virtual {v0, v2}, Lx0/o;->p(Z)V

    goto :goto_1e

    .line 46
    :goto_1f
    invoke-virtual {v0, v2}, Lx0/o;->p(Z)V

    if-eqz p4, :cond_2f

    const/4 v2, 0x1

    .line 47
    :cond_2f
    new-instance v5, Lm0/k8;

    move-object/from16 v16, p0

    move/from16 v18, p8

    move-object/from16 v21, p15

    move-object v7, v13

    move-object/from16 v17, v14

    move-object v9, v15

    move-object/from16 v8, v19

    move-object/from16 v14, p7

    move-object/from16 v19, p12

    move-object/from16 v15, p13

    move-object v13, v6

    move-object/from16 v6, p4

    invoke-direct/range {v5 .. v21}, Lm0/k8;-><init>(Lic/n;Lic/n;Ljava/lang/String;Lm0/x1;ZZLw/k;Lic/n;Lic/n;Lq1/l0;Lm0/w8;Lic/n;ZLy/d1;ZLic/n;)V

    const v4, 0x1fcac37

    invoke-static {v4, v5, v0}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    move-result-object v13

    const/high16 v15, 0x1b0000

    move-object v14, v0

    move-object v6, v1

    move v12, v2

    move-object v11, v3

    move-object/from16 v5, v22

    move-wide/from16 v7, v23

    move-wide/from16 v9, v25

    .line 48
    invoke-virtual/range {v5 .. v15}, Lm0/b3;->b(Lm0/s3;JJLm0/c8;ZLf1/f;Lx0/o;I)V

    goto :goto_20

    .line 49
    :cond_30
    invoke-virtual/range {p16 .. p16}, Lx0/o;->Q()V

    .line 50
    :goto_20
    invoke-virtual/range {p16 .. p16}, Lx0/o;->r()Lx0/p1;

    move-result-object v0

    if-eqz v0, :cond_31

    move-object v1, v0

    new-instance v0, Lm0/e8;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lm0/e8;-><init>(Lm0/w8;Ljava/lang/String;Lic/n;Ly2/g0;Lic/n;Lic/n;Lic/n;Lic/n;ZZZLw/k;Ly/d1;Lq1/l0;Lm0/x1;Lic/n;II)V

    move-object/from16 v1, v30

    .line 51
    iput-object v0, v1, Lx0/p1;->d:Lic/n;

    :cond_31
    return-void
.end method

.method public static final b(JLt2/l0;Lic/n;Lx0/o;II)V
    .locals 8

    .line 1
    const v1, 0x7b0fcb51

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v1}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4, p0, p1}, Lx0/o;->e(J)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x2

    .line 16
    :goto_0
    or-int/2addr v1, p5

    .line 17
    and-int/lit8 v2, p6, 0x2

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    or-int/lit8 v1, v1, 0x30

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_1
    invoke-virtual {p4, p2}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    const/16 v3, 0x20

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    const/16 v3, 0x10

    .line 34
    .line 35
    :goto_1
    or-int/2addr v1, v3

    .line 36
    :goto_2
    and-int/lit8 v3, p6, 0x4

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    or-int/lit16 v1, v1, 0x180

    .line 42
    .line 43
    goto :goto_4

    .line 44
    :cond_3
    and-int/lit16 v3, p5, 0x180

    .line 45
    .line 46
    if-nez v3, :cond_5

    .line 47
    .line 48
    invoke-virtual {p4, v4}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    const/16 v3, 0x100

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_4
    const/16 v3, 0x80

    .line 58
    .line 59
    :goto_3
    or-int/2addr v1, v3

    .line 60
    :cond_5
    :goto_4
    invoke-virtual {p4, p3}, Lx0/o;->h(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_6

    .line 65
    .line 66
    const/16 v3, 0x800

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    const/16 v3, 0x400

    .line 70
    .line 71
    :goto_5
    or-int/2addr v1, v3

    .line 72
    and-int/lit16 v3, v1, 0x493

    .line 73
    .line 74
    const/16 v6, 0x492

    .line 75
    .line 76
    const/4 v7, 0x0

    .line 77
    if-eq v3, v6, :cond_7

    .line 78
    .line 79
    const/4 v3, 0x1

    .line 80
    goto :goto_6

    .line 81
    :cond_7
    const/4 v3, 0x0

    .line 82
    :goto_6
    and-int/lit8 v6, v1, 0x1

    .line 83
    .line 84
    invoke-virtual {p4, v6, v3}, Lx0/o;->N(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_a

    .line 89
    .line 90
    if-eqz v2, :cond_8

    .line 91
    .line 92
    move-object p2, v4

    .line 93
    :cond_8
    new-instance v2, Lm0/l8;

    .line 94
    .line 95
    invoke-direct {v2, p0, p1, v4, p3}, Lm0/l8;-><init>(JLjava/lang/Float;Lic/n;)V

    .line 96
    .line 97
    .line 98
    const v3, -0x26ca46a5

    .line 99
    .line 100
    .line 101
    invoke-static {v3, v2, p4}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-eqz p2, :cond_9

    .line 106
    .line 107
    const v3, -0x9b555e1

    .line 108
    .line 109
    .line 110
    invoke-virtual {p4, v3}, Lx0/o;->W(I)V

    .line 111
    .line 112
    .line 113
    shr-int/lit8 v1, v1, 0x3

    .line 114
    .line 115
    and-int/lit8 v1, v1, 0xe

    .line 116
    .line 117
    or-int/lit8 v1, v1, 0x30

    .line 118
    .line 119
    invoke-static {p2, v2, p4, v1}, Lm0/z8;->a(Lt2/l0;Lic/n;Lx0/o;I)V

    .line 120
    .line 121
    .line 122
    :goto_7
    invoke-virtual {p4, v7}, Lx0/o;->p(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_8

    .line 126
    :cond_9
    const v1, -0x9b54f7d

    .line 127
    .line 128
    .line 129
    invoke-virtual {p4, v1}, Lx0/o;->W(I)V

    .line 130
    .line 131
    .line 132
    const/4 v1, 0x6

    .line 133
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v2, p4, v1}, Lf1/f;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    goto :goto_7

    .line 141
    :goto_8
    move-object v3, p2

    .line 142
    goto :goto_9

    .line 143
    :cond_a
    invoke-virtual {p4}, Lx0/o;->Q()V

    .line 144
    .line 145
    .line 146
    goto :goto_8

    .line 147
    :goto_9
    invoke-virtual {p4}, Lx0/o;->r()Lx0/p1;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-eqz p2, :cond_b

    .line 152
    .line 153
    new-instance v0, Lm0/f8;

    .line 154
    .line 155
    move-wide v1, p0

    .line 156
    move-object v4, p3

    .line 157
    move v5, p5

    .line 158
    move v6, p6

    .line 159
    invoke-direct/range {v0 .. v6}, Lm0/f8;-><init>(JLt2/l0;Lic/n;II)V

    .line 160
    .line 161
    .line 162
    iput-object v0, p2, Lx0/p1;->d:Lic/n;

    .line 163
    .line 164
    :cond_b
    return-void
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
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
.end method

.method public static final c(Lg2/u0;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-interface {p0}, Lg2/u0;->A()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p0, Lg2/d0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lg2/d0;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lg2/d0;->o:Ljava/lang/Object;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    return-object v1
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
