.class public abstract Lv0/n0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lv0/b;->h:Lv0/b;

    .line 2
    .line 3
    new-instance v1, Lx0/z;

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lx0/z;-><init>(Lic/a;)V

    .line 6
    .line 7
    .line 8
    sput-object v1, Lv0/n0;->a:Lx0/z;

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

.method public static final a(Ljava/lang/String;Lj1/q;JJJLe3/k;JIZIILt2/l0;Lx0/o;II)V
    .locals 31

    move-wide/from16 v3, p2

    move-object/from16 v0, p16

    move/from16 v1, p17

    move/from16 v2, p18

    const v5, -0x7a7e7926

    .line 1
    invoke-virtual {v0, v5}, Lx0/o;->Y(I)Lx0/o;

    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_1

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v6, v6, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    :goto_3
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v0, v3, v4}, Lx0/o;->e(J)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_4

    :cond_5
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    :cond_6
    const v9, 0x6db6c00

    or-int/2addr v9, v6

    and-int/lit16 v10, v2, 0x200

    if-eqz v10, :cond_8

    const v9, 0x36db6c00

    or-int/2addr v9, v6

    :cond_7
    move-object/from16 v6, p8

    goto :goto_6

    :cond_8
    const/high16 v6, 0x30000000

    and-int/2addr v6, v1

    if-nez v6, :cond_7

    move-object/from16 v6, p8

    invoke-virtual {v0, v6}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/high16 v11, 0x20000000

    goto :goto_5

    :cond_9
    const/high16 v11, 0x10000000

    :goto_5
    or-int/2addr v9, v11

    :goto_6
    const/high16 v11, 0x10000

    and-int v12, v2, v11

    if-nez v12, :cond_a

    move-object/from16 v12, p15

    invoke-virtual {v0, v12}, Lx0/o;->f(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/high16 v13, 0x100000

    goto :goto_7

    :cond_a
    move-object/from16 v12, p15

    :cond_b
    const/high16 v13, 0x80000

    :goto_7
    const v14, 0x36db6

    or-int/2addr v13, v14

    const v14, 0x12492493

    and-int/2addr v14, v9

    const v15, 0x12492492

    if-ne v14, v15, :cond_d

    const v14, 0x92493

    and-int/2addr v13, v14

    const v14, 0x92492

    if-ne v13, v14, :cond_d

    invoke-virtual {v0}, Lx0/o;->z()Z

    move-result v13

    if-nez v13, :cond_c

    goto :goto_8

    .line 2
    :cond_c
    invoke-virtual {v0}, Lx0/o;->Q()V

    move-wide/from16 v17, p6

    move-wide/from16 v10, p9

    move/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object v9, v6

    move-object v7, v8

    move-object/from16 v16, v12

    move-wide/from16 v5, p4

    move/from16 v12, p11

    goto/16 :goto_11

    .line 3
    :cond_d
    :goto_8
    invoke-virtual {v0}, Lx0/o;->S()V

    and-int/lit8 v13, v1, 0x1

    if-eqz v13, :cond_f

    invoke-virtual {v0}, Lx0/o;->x()Z

    move-result v13

    if-eqz v13, :cond_e

    goto :goto_9

    .line 4
    :cond_e
    invoke-virtual {v0}, Lx0/o;->Q()V

    move-wide/from16 v13, p4

    move-wide/from16 v17, p6

    move-wide/from16 v21, p9

    move/from16 v24, p12

    move/from16 v25, p13

    move/from16 v26, p14

    move-object v7, v8

    move-object v10, v12

    move/from16 v8, p11

    goto :goto_c

    :cond_f
    :goto_9
    if-eqz v7, :cond_10

    .line 5
    sget-object v7, Lj1/n;->a:Lj1/n;

    goto :goto_a

    :cond_10
    move-object v7, v8

    .line 6
    :goto_a
    sget-wide v13, Lf3/o;->c:J

    if-eqz v10, :cond_11

    const/4 v6, 0x0

    :cond_11
    and-int v8, v2, v11

    const/4 v10, 0x1

    const v11, 0x7fffffff

    if-eqz v8, :cond_12

    .line 7
    sget-object v8, Lv0/n0;->a:Lx0/z;

    .line 8
    invoke-virtual {v0, v8}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lt2/l0;

    move-object v10, v8

    :goto_b
    move-wide/from16 v17, v13

    move-wide/from16 v21, v17

    const/4 v8, 0x1

    const/16 v24, 0x1

    const v25, 0x7fffffff

    const/16 v26, 0x1

    goto :goto_c

    :cond_12
    move-object v10, v12

    goto :goto_b

    :goto_c
    invoke-virtual {v0}, Lx0/o;->q()V

    const v11, 0x4be566b

    .line 9
    invoke-virtual {v0, v11}, Lx0/o;->X(I)V

    .line 10
    sget-wide v11, Lq1/q;->h:J

    cmp-long v16, v3, v11

    if-eqz v16, :cond_13

    move-wide v15, v3

    const/4 v11, 0x0

    goto :goto_f

    :cond_13
    const v15, 0x4be568c

    .line 11
    invoke-virtual {v0, v15}, Lx0/o;->X(I)V

    .line 12
    invoke-virtual {v10}, Lt2/l0;->b()J

    move-result-wide v15

    cmp-long v19, v15, v11

    if-eqz v19, :cond_14

    :goto_d
    const/4 v11, 0x0

    goto :goto_e

    .line 13
    :cond_14
    sget-object v11, Lv0/d;->a:Lx0/z;

    .line 14
    invoke-virtual {v0, v11}, Lx0/o;->j(Lx0/m1;)Ljava/lang/Object;

    move-result-object v11

    .line 15
    check-cast v11, Lq1/q;

    .line 16
    iget-wide v11, v11, Lq1/q;->a:J

    move-wide v15, v11

    goto :goto_d

    .line 17
    :goto_e
    invoke-virtual {v0, v11}, Lx0/o;->p(Z)V

    .line 18
    :goto_f
    invoke-virtual {v0, v11}, Lx0/o;->p(Z)V

    if-eqz v6, :cond_15

    .line 19
    iget v11, v6, Le3/k;->a:I

    move/from16 v20, v11

    goto :goto_10

    :cond_15
    const/high16 v11, -0x80000000

    const/high16 v20, -0x80000000

    :goto_10
    const v23, 0xfd6f50

    move-wide v11, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    .line 20
    invoke-static/range {v10 .. v23}, Lt2/l0;->e(Lt2/l0;JJLx2/k;Lx2/i;JLe3/l;IJI)Lt2/l0;

    move-result-object v11

    and-int/lit8 v9, v9, 0x7e

    const v12, 0xdb6c00

    or-int/2addr v9, v12

    move-object/from16 p11, v0

    move-object/from16 p4, v5

    move-object/from16 p5, v7

    move/from16 p7, v8

    move/from16 p12, v9

    move-object/from16 p6, v11

    move/from16 p8, v24

    move/from16 p9, v25

    move/from16 p10, v26

    .line 21
    invoke-static/range {p4 .. p12}, Lh0/q0;->b(Ljava/lang/String;Lj1/q;Lt2/l0;IZIILx0/o;I)V

    move/from16 v0, p7

    move/from16 v5, p8

    move/from16 v11, p9

    move/from16 v8, p10

    move v12, v0

    move-object v9, v6

    move v15, v8

    move-object/from16 v16, v10

    move-wide/from16 v28, v13

    move v13, v5

    move v14, v11

    move-wide/from16 v5, v28

    move-wide/from16 v10, v21

    .line 22
    :goto_11
    invoke-virtual/range {p16 .. p16}, Lx0/o;->r()Lx0/p1;

    move-result-object v0

    if-eqz v0, :cond_16

    move-object v8, v0

    new-instance v0, Lv0/m0;

    move-object/from16 v27, v8

    move/from16 v28, v1

    move-object/from16 v1, p0

    move-wide/from16 v29, v17

    move/from16 v17, v28

    move/from16 v18, v2

    move-object v2, v7

    move-wide/from16 v7, v29

    invoke-direct/range {v0 .. v18}, Lv0/m0;-><init>(Ljava/lang/String;Lj1/q;JJJLe3/k;JIZIILt2/l0;II)V

    move-object/from16 v8, v27

    .line 23
    iput-object v0, v8, Lx0/p1;->d:Lic/n;

    :cond_16
    return-void
.end method
