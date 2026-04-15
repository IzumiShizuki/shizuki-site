.class public abstract Lh0/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x28

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0, v0}, La2/c;->e(FF)J

    .line 5
    .line 6
    .line 7
    return-void
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

.method public static final a(Ljava/lang/String;Lic/k;Lj1/q;ZZLt2/l0;Lh0/t0;Lh0/s0;ZIILy2/g0;Lic/k;Lw/k;Lq1/n0;Lf1/f;Lx0/o;II)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v0, p16

    move/from16 v3, p17

    move/from16 v4, p18

    const v5, 0x3857730f

    .line 1
    invoke-virtual {v0, v5}, Lx0/o;->Y(I)Lx0/o;

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    goto :goto_1

    :cond_1
    move v5, v3

    :goto_1
    and-int/lit8 v10, v3, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v0, v2}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v5, v10

    :cond_3
    and-int/lit16 v10, v3, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v0, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_3

    :cond_4
    const/16 v13, 0x80

    :goto_3
    or-int/2addr v5, v13

    goto :goto_4

    :cond_5
    move-object/from16 v10, p2

    :goto_4
    and-int/lit16 v13, v3, 0xc00

    if-nez v13, :cond_7

    move/from16 v13, p3

    invoke-virtual {v0, v13}, Lx0/o;->g(Z)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x800

    goto :goto_5

    :cond_6
    const/16 v16, 0x400

    :goto_5
    or-int v5, v5, v16

    goto :goto_6

    :cond_7
    move/from16 v13, p3

    :goto_6
    and-int/lit16 v8, v3, 0x6000

    const/16 v17, 0x2000

    const/16 v18, 0x4000

    if-nez v8, :cond_9

    move/from16 v8, p4

    invoke-virtual {v0, v8}, Lx0/o;->g(Z)Z

    move-result v19

    if-eqz v19, :cond_8

    const/16 v19, 0x4000

    goto :goto_7

    :cond_8
    const/16 v19, 0x2000

    :goto_7
    or-int v5, v5, v19

    goto :goto_8

    :cond_9
    move/from16 v8, p4

    :goto_8
    const/high16 v19, 0x30000

    and-int v20, v3, v19

    const/high16 v21, 0x10000

    const/high16 v22, 0x20000

    move-object/from16 v11, p5

    if-nez v20, :cond_b

    invoke-virtual {v0, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_a

    const/high16 v23, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v23, 0x10000

    :goto_9
    or-int v5, v5, v23

    :cond_b
    const/high16 v23, 0x180000

    and-int v23, v3, v23

    if-nez v23, :cond_d

    invoke-virtual {v0, v7}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_c

    const/high16 v23, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v23, 0x80000

    :goto_a
    or-int v5, v5, v23

    :cond_d
    const/high16 v23, 0xc00000

    and-int v23, v3, v23

    move-object/from16 v14, p7

    if-nez v23, :cond_f

    invoke-virtual {v0, v14}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_e

    const/high16 v24, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v24, 0x400000

    :goto_b
    or-int v5, v5, v24

    :cond_f
    const/high16 v24, 0x6000000

    and-int v24, v3, v24

    if-nez v24, :cond_11

    invoke-virtual {v0, v9}, Lx0/o;->g(Z)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v24, 0x2000000

    :goto_c
    or-int v5, v5, v24

    :cond_11
    const/high16 v24, 0x30000000

    and-int v24, v3, v24

    move/from16 v12, p9

    if-nez v24, :cond_13

    invoke-virtual {v0, v12}, Lx0/o;->d(I)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v25, 0x10000000

    :goto_d
    or-int v5, v5, v25

    :cond_13
    and-int/lit8 v25, v4, 0x6

    move/from16 v6, p10

    if-nez v25, :cond_15

    invoke-virtual {v0, v6}, Lx0/o;->d(I)Z

    move-result v26

    if-eqz v26, :cond_14

    const/16 v16, 0x4

    goto :goto_e

    :cond_14
    const/16 v16, 0x2

    :goto_e
    or-int v16, v4, v16

    goto :goto_f

    :cond_15
    move/from16 v16, v4

    :goto_f
    and-int/lit8 v26, v4, 0x30

    move-object/from16 v15, p11

    if-nez v26, :cond_17

    invoke-virtual {v0, v15}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_16

    const/16 v20, 0x20

    goto :goto_10

    :cond_16
    const/16 v20, 0x10

    :goto_10
    or-int v16, v16, v20

    :cond_17
    move/from16 v3, v16

    or-int/lit16 v3, v3, 0x180

    move/from16 v16, v3

    and-int/lit16 v3, v4, 0xc00

    if-nez v3, :cond_19

    move-object/from16 v3, p13

    invoke-virtual {v0, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_18

    const/16 v23, 0x800

    goto :goto_11

    :cond_18
    const/16 v23, 0x400

    :goto_11
    or-int v16, v16, v23

    goto :goto_12

    :cond_19
    move-object/from16 v3, p13

    :goto_12
    and-int/lit16 v3, v4, 0x6000

    if-nez v3, :cond_1b

    move-object/from16 v3, p14

    invoke-virtual {v0, v3}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1a

    const/16 v17, 0x4000

    :cond_1a
    or-int v16, v16, v17

    goto :goto_13

    :cond_1b
    move-object/from16 v3, p14

    :goto_13
    and-int v17, v4, v19

    move-object/from16 v3, p15

    if-nez v17, :cond_1d

    invoke-virtual {v0, v3}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1c

    const/high16 v21, 0x20000

    :cond_1c
    or-int v16, v16, v21

    :cond_1d
    const v17, 0x12492493

    and-int v3, v5, v17

    const v4, 0x12492492

    const/16 v17, 0x0

    const/16 v18, 0x1

    if-ne v3, v4, :cond_1f

    const v3, 0x12493

    and-int v3, v16, v3

    const v4, 0x12492

    if-eq v3, v4, :cond_1e

    goto :goto_14

    :cond_1e
    const/4 v3, 0x0

    goto :goto_15

    :cond_1f
    :goto_14
    const/4 v3, 0x1

    :goto_15
    and-int/lit8 v4, v5, 0x1

    invoke-virtual {v0, v4, v3}, Lx0/o;->N(IZ)Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-virtual {v0}, Lx0/o;->S()V

    and-int/lit8 v3, p17, 0x1

    if-eqz v3, :cond_21

    invoke-virtual {v0}, Lx0/o;->x()Z

    move-result v3

    if-eqz v3, :cond_20

    goto :goto_16

    .line 2
    :cond_20
    invoke-virtual {v0}, Lx0/o;->Q()V

    move-object/from16 v3, p12

    goto :goto_17

    .line 3
    :cond_21
    :goto_16
    sget-object v3, Lh0/h;->d:Lh0/h;

    .line 4
    :goto_17
    invoke-virtual {v0}, Lx0/o;->q()V

    .line 5
    invoke-virtual {v0}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p12, v3

    .line 6
    sget-object v3, Lx0/k;->a:Lx0/r0;

    if-ne v4, v3, :cond_22

    .line 7
    new-instance v4, Ly2/y;

    const-wide/16 v10, 0x0

    const/4 v6, 0x6

    invoke-direct {v4, v10, v11, v1, v6}, Ly2/y;-><init>(JLjava/lang/String;I)V

    invoke-static {v4}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    move-result-object v4

    .line 8
    invoke-virtual {v0, v4}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 9
    :cond_22
    check-cast v4, Lx0/w0;

    .line 10
    invoke-interface {v4}, Lx0/n2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly2/y;

    .line 11
    iget-wide v10, v6, Ly2/y;->b:J

    .line 12
    iget-object v6, v6, Ly2/y;->c:Lt2/k0;

    .line 13
    new-instance v8, Ly2/y;

    new-instance v12, Lt2/g;

    invoke-direct {v12, v1}, Lt2/g;-><init>(Ljava/lang/String;)V

    invoke-direct {v8, v12, v10, v11, v6}, Ly2/y;-><init>(Lt2/g;JLt2/k0;)V

    .line 14
    invoke-virtual {v0, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v6

    .line 15
    invoke-virtual {v0}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_23

    if-ne v10, v3, :cond_24

    .line 16
    :cond_23
    new-instance v10, Lb0/s1;

    const/4 v6, 0x4

    invoke-direct {v10, v6, v8, v4}, Lb0/s1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 17
    invoke-virtual {v0, v10}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 18
    :cond_24
    check-cast v10, Lic/a;

    invoke-static {v10, v0}, Lx0/v;->h(Lic/a;Lx0/o;)V

    and-int/lit8 v6, v5, 0xe

    const/4 v10, 0x4

    if-ne v6, v10, :cond_25

    const/4 v6, 0x1

    goto :goto_18

    :cond_25
    const/4 v6, 0x0

    .line 19
    :goto_18
    invoke-virtual {v0}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v10

    if-nez v6, :cond_26

    if-ne v10, v3, :cond_27

    .line 20
    :cond_26
    invoke-static {v1}, Lx0/v;->v(Ljava/lang/Object;)Lx0/e1;

    move-result-object v10

    .line 21
    invoke-virtual {v0, v10}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 22
    :cond_27
    check-cast v10, Lx0/w0;

    .line 23
    invoke-virtual {v7, v9}, Lh0/t0;->a(Z)Ly2/j;

    move-result-object v21

    const/4 v6, 0x1

    xor-int/lit8 v18, v9, 0x1

    if-eqz v9, :cond_28

    const/16 v20, 0x1

    goto :goto_19

    :cond_28
    move/from16 v20, p10

    :goto_19
    if-eqz v9, :cond_29

    const/16 v19, 0x1

    goto :goto_1a

    :cond_29
    move/from16 v19, p9

    .line 24
    :goto_1a
    invoke-virtual {v0, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit8 v12, v5, 0x70

    const/16 v6, 0x20

    if-ne v12, v6, :cond_2a

    const/16 v17, 0x1

    :cond_2a
    or-int v6, v11, v17

    .line 25
    invoke-virtual {v0}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_2b

    if-ne v11, v3, :cond_2c

    .line 26
    :cond_2b
    new-instance v11, Lcg/b;

    invoke-direct {v11, v2, v4, v10}, Lcg/b;-><init>(Lic/k;Lx0/w0;Lx0/w0;)V

    .line 27
    invoke-virtual {v0, v11}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 28
    :cond_2c
    check-cast v11, Lic/k;

    and-int/lit16 v3, v5, 0x380

    shr-int/lit8 v4, v5, 0x6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    shl-int/lit8 v4, v16, 0x9

    const v6, 0xe000

    and-int v10, v4, v6

    or-int/2addr v3, v10

    const/high16 v10, 0x70000

    and-int v12, v4, v10

    or-int/2addr v3, v12

    const/high16 v12, 0x380000

    and-int/2addr v12, v4

    or-int/2addr v3, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v4, v12

    or-int v27, v3, v4

    shr-int/lit8 v3, v5, 0xf

    and-int/lit16 v3, v3, 0x380

    and-int/lit16 v4, v5, 0x1c00

    or-int/2addr v3, v4

    and-int v4, v5, v6

    or-int/2addr v3, v4

    and-int v4, v16, v10

    or-int v28, v3, v4

    move-object/from16 v12, p2

    move/from16 v24, p4

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move-object/from16 v25, p15

    move-object/from16 v26, v0

    move-object v10, v8

    move/from16 v23, v13

    move-object/from16 v22, v14

    move-object v14, v15

    move-object/from16 v13, p5

    move-object/from16 v15, p12

    .line 29
    invoke-static/range {v10 .. v28}, Lh0/q0;->e(Ly2/y;Lic/k;Lj1/q;Lt2/l0;Ly2/g0;Lic/k;Lw/k;Lq1/n0;ZIILy2/j;Lh0/s0;ZZLf1/f;Lx0/o;II)V

    move-object v13, v15

    goto :goto_1b

    .line 30
    :cond_2d
    invoke-virtual/range {p16 .. p16}, Lx0/o;->Q()V

    move-object/from16 v13, p12

    :goto_1b
    invoke-virtual/range {p16 .. p16}, Lx0/o;->r()Lx0/p1;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v3, v0

    new-instance v0, Lh0/j;

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v29, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v18}, Lh0/j;-><init>(Ljava/lang/String;Lic/k;Lj1/q;ZZLt2/l0;Lh0/t0;Lh0/s0;ZIILy2/g0;Lic/k;Lw/k;Lq1/n0;Lf1/f;II)V

    move-object/from16 v3, v29

    .line 31
    iput-object v0, v3, Lx0/p1;->d:Lic/n;

    :cond_2e
    return-void
.end method

.method public static final b(Ly2/y;Lic/k;Lj1/q;ZLt2/l0;Lh0/t0;Lh0/s0;ZIILy2/g0;Lic/k;Lw/k;Lq1/n0;Lf1/f;Lx0/o;II)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p5

    move/from16 v3, p7

    move-object/from16 v4, p15

    move/from16 v5, p16

    move/from16 v6, p17

    const v7, 0x6b8eb362

    .line 1
    invoke-virtual {v4, v7}, Lx0/o;->Y(I)Lx0/o;

    and-int/lit8 v7, v5, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v4, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_1
    move v7, v5

    :goto_1
    and-int/lit8 v10, v5, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v4, v1}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :cond_3
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v4, v10}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_3

    :cond_4
    const/16 v13, 0x80

    :goto_3
    or-int/2addr v7, v13

    goto :goto_4

    :cond_5
    move-object/from16 v10, p2

    :goto_4
    and-int/lit16 v13, v5, 0xc00

    if-nez v13, :cond_7

    move/from16 v13, p3

    invoke-virtual {v4, v13}, Lx0/o;->g(Z)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x800

    goto :goto_5

    :cond_6
    const/16 v16, 0x400

    :goto_5
    or-int v7, v7, v16

    goto :goto_6

    :cond_7
    move/from16 v13, p3

    :goto_6
    and-int/lit16 v8, v5, 0x6000

    const/4 v11, 0x0

    const/16 v18, 0x2000

    const/16 v19, 0x4000

    if-nez v8, :cond_9

    invoke-virtual {v4, v11}, Lx0/o;->g(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_7

    :cond_8
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v7, v8

    :cond_9
    const/high16 v8, 0x30000

    and-int v20, v5, v8

    const/high16 v21, 0x10000

    const/high16 v22, 0x20000

    move-object/from16 v8, p4

    if-nez v20, :cond_b

    const/high16 v20, 0x30000

    invoke-virtual {v4, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_a

    const/high16 v23, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v23, 0x10000

    :goto_8
    or-int v7, v7, v23

    goto :goto_9

    :cond_b
    const/high16 v20, 0x30000

    :goto_9
    const/high16 v23, 0x180000

    and-int v23, v5, v23

    if-nez v23, :cond_d

    invoke-virtual {v4, v2}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_c

    const/high16 v23, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v23, 0x80000

    :goto_a
    or-int v7, v7, v23

    :cond_d
    const/high16 v23, 0xc00000

    and-int v23, v5, v23

    move-object/from16 v11, p6

    if-nez v23, :cond_f

    invoke-virtual {v4, v11}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_e

    const/high16 v24, 0x800000

    goto :goto_b

    :cond_e
    const/high16 v24, 0x400000

    :goto_b
    or-int v7, v7, v24

    :cond_f
    const/high16 v24, 0x6000000

    and-int v24, v5, v24

    if-nez v24, :cond_11

    invoke-virtual {v4, v3}, Lx0/o;->g(Z)Z

    move-result v24

    if-eqz v24, :cond_10

    const/high16 v24, 0x4000000

    goto :goto_c

    :cond_10
    const/high16 v24, 0x2000000

    :goto_c
    or-int v7, v7, v24

    :cond_11
    const/high16 v24, 0x30000000

    and-int v24, v5, v24

    move/from16 v14, p8

    if-nez v24, :cond_13

    invoke-virtual {v4, v14}, Lx0/o;->d(I)Z

    move-result v25

    if-eqz v25, :cond_12

    const/high16 v25, 0x20000000

    goto :goto_d

    :cond_12
    const/high16 v25, 0x10000000

    :goto_d
    or-int v7, v7, v25

    :cond_13
    and-int/lit8 v25, v6, 0x6

    move/from16 v14, p9

    if-nez v25, :cond_15

    invoke-virtual {v4, v14}, Lx0/o;->d(I)Z

    move-result v25

    if-eqz v25, :cond_14

    const/16 v16, 0x4

    goto :goto_e

    :cond_14
    const/16 v16, 0x2

    :goto_e
    or-int v16, v6, v16

    goto :goto_f

    :cond_15
    move/from16 v16, v6

    :goto_f
    and-int/lit8 v25, v6, 0x30

    move-object/from16 v15, p10

    if-nez v25, :cond_17

    invoke-virtual {v4, v15}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_16

    const/16 v17, 0x20

    goto :goto_10

    :cond_16
    const/16 v17, 0x10

    :goto_10
    or-int v16, v16, v17

    :cond_17
    move/from16 v12, v16

    or-int/lit16 v12, v12, 0x180

    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_19

    move-object/from16 v9, p12

    invoke-virtual {v4, v9}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_18

    const/16 v24, 0x800

    goto :goto_11

    :cond_18
    const/16 v24, 0x400

    :goto_11
    or-int v12, v12, v24

    goto :goto_12

    :cond_19
    move-object/from16 v9, p12

    :goto_12
    and-int/lit16 v5, v6, 0x6000

    if-nez v5, :cond_1b

    move-object/from16 v5, p13

    invoke-virtual {v4, v5}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1a

    const/16 v18, 0x4000

    :cond_1a
    or-int v12, v12, v18

    goto :goto_13

    :cond_1b
    move-object/from16 v5, p13

    :goto_13
    and-int v18, v6, v20

    move-object/from16 v5, p14

    if-nez v18, :cond_1d

    invoke-virtual {v4, v5}, Lx0/o;->h(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1c

    const/high16 v21, 0x20000

    :cond_1c
    or-int v12, v12, v21

    :cond_1d
    const v18, 0x12492493

    and-int v5, v7, v18

    const v6, 0x12492492

    const/16 v18, 0x1

    if-ne v5, v6, :cond_1f

    const v5, 0x12493

    and-int/2addr v5, v12

    const v6, 0x12492

    if-eq v5, v6, :cond_1e

    goto :goto_14

    :cond_1e
    const/4 v5, 0x0

    goto :goto_15

    :cond_1f
    :goto_14
    const/4 v5, 0x1

    :goto_15
    and-int/lit8 v6, v7, 0x1

    invoke-virtual {v4, v6, v5}, Lx0/o;->N(IZ)Z

    move-result v5

    if-eqz v5, :cond_28

    invoke-virtual {v4}, Lx0/o;->S()V

    and-int/lit8 v5, p16, 0x1

    if-eqz v5, :cond_21

    invoke-virtual {v4}, Lx0/o;->x()Z

    move-result v5

    if-eqz v5, :cond_20

    goto :goto_16

    .line 2
    :cond_20
    invoke-virtual {v4}, Lx0/o;->Q()V

    move-object/from16 v5, p11

    goto :goto_17

    .line 3
    :cond_21
    :goto_16
    sget-object v5, Lh0/h;->c:Lh0/h;

    .line 4
    :goto_17
    invoke-virtual {v4}, Lx0/o;->q()V

    .line 5
    invoke-virtual {v2, v3}, Lh0/t0;->a(Z)Ly2/j;

    move-result-object v11

    xor-int/lit8 v8, v3, 0x1

    if-eqz v3, :cond_22

    const/4 v10, 0x1

    goto :goto_18

    :cond_22
    move v10, v14

    :goto_18
    if-eqz v3, :cond_23

    const/4 v9, 0x1

    goto :goto_19

    :cond_23
    move/from16 v9, p8

    :goto_19
    and-int/lit8 v6, v7, 0xe

    const/4 v2, 0x4

    if-ne v6, v2, :cond_24

    const/4 v2, 0x1

    goto :goto_1a

    :cond_24
    const/4 v2, 0x0

    :goto_1a
    and-int/lit8 v6, v7, 0x70

    move/from16 p11, v2

    const/16 v2, 0x20

    if-ne v6, v2, :cond_25

    goto :goto_1b

    :cond_25
    const/16 v18, 0x0

    :goto_1b
    or-int v2, p11, v18

    .line 6
    invoke-virtual {v4}, Lx0/o;->K()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_26

    .line 7
    sget-object v2, Lx0/k;->a:Lx0/r0;

    if-ne v6, v2, :cond_27

    .line 8
    :cond_26
    new-instance v6, Lb0/o1;

    const/4 v2, 0x7

    invoke-direct {v6, v2, v0, v1}, Lb0/o1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v4, v6}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 10
    :cond_27
    check-cast v6, Lic/k;

    and-int/lit16 v2, v7, 0x38e

    shr-int/lit8 v0, v7, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v2

    shl-int/lit8 v2, v12, 0x9

    const v16, 0xe000

    and-int v17, v2, v16

    or-int v0, v0, v17

    const/high16 v17, 0x70000

    and-int v18, v2, v17

    or-int v0, v0, v18

    const/high16 v18, 0x380000

    and-int v18, v2, v18

    or-int v0, v0, v18

    const/high16 v18, 0x1c00000

    and-int v2, v2, v18

    or-int/2addr v0, v2

    shr-int/lit8 v2, v7, 0xf

    and-int/lit16 v2, v2, 0x380

    move/from16 p11, v0

    and-int/lit16 v0, v7, 0x1c00

    or-int/2addr v0, v2

    and-int v2, v7, v16

    or-int/2addr v0, v2

    and-int v2, v12, v17

    or-int v18, v0, v2

    const/4 v14, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v12, p6

    move/from16 v17, p11

    move-object/from16 v7, p13

    move-object/from16 v16, v4

    move-object v1, v6

    move-object v4, v15

    move-object/from16 v6, p12

    move-object/from16 v15, p14

    .line 11
    invoke-static/range {v0 .. v18}, Lh0/q0;->e(Ly2/y;Lic/k;Lj1/q;Lt2/l0;Ly2/g0;Lic/k;Lw/k;Lq1/n0;ZIILy2/j;Lh0/s0;ZZLf1/f;Lx0/o;II)V

    move-object v12, v5

    goto :goto_1c

    .line 12
    :cond_28
    invoke-virtual/range {p15 .. p15}, Lx0/o;->Q()V

    move-object/from16 v12, p11

    :goto_1c
    invoke-virtual/range {p15 .. p15}, Lx0/o;->r()Lx0/p1;

    move-result-object v0

    if-eqz v0, :cond_29

    move-object v1, v0

    new-instance v0, Lh0/i;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v27, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v17}, Lh0/i;-><init>(Ly2/y;Lic/k;Lj1/q;ZLt2/l0;Lh0/t0;Lh0/s0;ZIILy2/g0;Lic/k;Lw/k;Lq1/n0;Lf1/f;II)V

    move-object/from16 v1, v27

    .line 13
    iput-object v0, v1, Lx0/p1;->d:Lic/n;

    :cond_29
    return-void
.end method
