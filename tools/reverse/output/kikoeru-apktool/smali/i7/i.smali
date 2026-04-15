.class public final Li7/i;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/o;


# instance fields
.field public final synthetic e:I

.field public f:I

.field public g:Ljava/lang/Object;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Lyb/c;)V
    .locals 0

    .line 1
    iput p1, p0, Li7/i;->e:I

    iput-object p2, p0, Li7/i;->i:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Li7/o0;Lyb/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li7/i;->e:I

    .line 2
    iput-object p1, p0, Li7/i;->i:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lic/n;Lyb/c;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Li7/i;->e:I

    .line 3
    check-cast p1, Lac/i;

    iput-object p1, p0, Li7/i;->i:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li7/i;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Llf/g;

    .line 7
    .line 8
    check-cast p3, Lyb/c;

    .line 9
    .line 10
    new-instance v0, Li7/i;

    .line 11
    .line 12
    iget-object v1, p0, Li7/i;->i:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lac/i;

    .line 15
    .line 16
    invoke-direct {v0, v1, p3}, Li7/i;-><init>(Lic/n;Lyb/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object p2, v0, Li7/i;->h:Ljava/lang/Object;

    .line 22
    .line 23
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Li7/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :pswitch_0
    check-cast p1, Llf/g;

    .line 31
    .line 32
    check-cast p3, Lyb/c;

    .line 33
    .line 34
    new-instance v0, Li7/i;

    .line 35
    .line 36
    iget-object v1, p0, Li7/i;->i:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Li7/o0;

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-direct {v0, v2, v1, p3}, Li7/i;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 45
    .line 46
    iput-object p2, v0, Li7/i;->h:Ljava/lang/Object;

    .line 47
    .line 48
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Li7/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :pswitch_1
    check-cast p1, Li7/l0;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    check-cast p3, Lyb/c;

    .line 63
    .line 64
    new-instance p2, Li7/i;

    .line 65
    .line 66
    iget-object v0, p0, Li7/i;->i:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Li7/o0;

    .line 69
    .line 70
    invoke-direct {p2, v0, p3}, Li7/i;-><init>(Li7/o0;Lyb/c;)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p2, Li7/i;->h:Ljava/lang/Object;

    .line 74
    .line 75
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 76
    .line 77
    invoke-virtual {p2, p1}, Li7/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1

    .line 82
    :pswitch_2
    check-cast p1, Llf/g;

    .line 83
    .line 84
    check-cast p3, Lyb/c;

    .line 85
    .line 86
    new-instance v0, Li7/i;

    .line 87
    .line 88
    iget-object v1, p0, Li7/i;->i:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Lk4/a;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v0, v2, v1, p3}, Li7/i;-><init>(ILjava/lang/Object;Lyb/c;)V

    .line 94
    .line 95
    .line 96
    iput-object p1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p2, v0, Li7/i;->h:Ljava/lang/Object;

    .line 99
    .line 100
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Li7/i;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Li7/i;->e:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v1, v0, Li7/i;->f:I

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    const/4 v3, 0x1

    .line 12
    sget-object v4, Lzb/a;->a:Lzb/a;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    if-eq v1, v3, :cond_1

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :cond_1
    iget-object v1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Llf/g;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object/from16 v3, p1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Llf/g;

    .line 48
    .line 49
    iget-object v5, v0, Li7/i;->h:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v6, v0, Li7/i;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, Lac/i;

    .line 54
    .line 55
    iput-object v1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 56
    .line 57
    iput v3, v0, Li7/i;->f:I

    .line 58
    .line 59
    invoke-interface {v6, v5, v0}, Lic/n;->q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    if-ne v3, v4, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_0
    const/4 v5, 0x0

    .line 67
    iput-object v5, v0, Li7/i;->g:Ljava/lang/Object;

    .line 68
    .line 69
    iput v2, v0, Li7/i;->f:I

    .line 70
    .line 71
    invoke-interface {v1, v3, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-ne v1, v4, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    sget-object v4, Lub/a0;->a:Lub/a0;

    .line 79
    .line 80
    :goto_2
    return-object v4

    .line 81
    :pswitch_0
    iget-object v1, v0, Li7/i;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Li7/o0;

    .line 84
    .line 85
    iget v2, v0, Li7/i;->f:I

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    if-ne v2, v3, :cond_5

    .line 91
    .line 92
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v1

    .line 104
    :cond_6
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iget-object v2, v0, Li7/i;->g:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Llf/g;

    .line 110
    .line 111
    iget-object v4, v0, Li7/i;->h:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, Li7/l0;

    .line 114
    .line 115
    iget-object v5, v4, Li7/l0;->a:Li7/d1;

    .line 116
    .line 117
    iget-object v5, v5, Li7/d1;->j:Li7/v1;

    .line 118
    .line 119
    new-instance v6, Li7/a;

    .line 120
    .line 121
    const/4 v7, 0x2

    .line 122
    const/4 v8, 0x1

    .line 123
    const/4 v9, 0x0

    .line 124
    invoke-direct {v6, v7, v9, v8}, Li7/a;-><init>(ILyb/c;I)V

    .line 125
    .line 126
    .line 127
    new-instance v7, Llf/s;

    .line 128
    .line 129
    const/4 v8, 0x2

    .line 130
    invoke-direct {v7, v5, v6, v8}, Llf/s;-><init>(Llf/f;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    new-instance v5, Li7/l1;

    .line 134
    .line 135
    new-instance v6, Landroidx/media3/exoplayer/offline/u;

    .line 136
    .line 137
    iget-object v8, v1, Li7/o0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 138
    .line 139
    invoke-direct {v6, v1, v8}, Landroidx/media3/exoplayer/offline/u;-><init>(Li7/o0;Landroidx/media3/exoplayer/offline/u;)V

    .line 140
    .line 141
    .line 142
    new-instance v1, Lb0/c1;

    .line 143
    .line 144
    iget-object v4, v4, Li7/l0;->a:Li7/d1;

    .line 145
    .line 146
    const/16 v8, 0x1d

    .line 147
    .line 148
    invoke-direct {v1, v8, v4}, Lb0/c1;-><init>(ILjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    sget-object v4, Li7/k1;->b:Li7/k1;

    .line 152
    .line 153
    invoke-direct {v5, v7, v6, v1, v4}, Li7/l1;-><init>(Llf/f;Li7/r2;Lb0/c1;Lic/a;)V

    .line 154
    .line 155
    .line 156
    iput v3, v0, Li7/i;->f:I

    .line 157
    .line 158
    invoke-interface {v2, v5, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    sget-object v2, Lzb/a;->a:Lzb/a;

    .line 163
    .line 164
    if-ne v1, v2, :cond_7

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    :goto_3
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 168
    .line 169
    :goto_4
    return-object v2

    .line 170
    :pswitch_1
    iget-object v1, v0, Li7/i;->i:Ljava/lang/Object;

    .line 171
    .line 172
    move-object v4, v1

    .line 173
    check-cast v4, Li7/o0;

    .line 174
    .line 175
    iget v1, v0, Li7/i;->f:I

    .line 176
    .line 177
    const/4 v2, 0x2

    .line 178
    const/4 v3, 0x1

    .line 179
    const/4 v5, 0x0

    .line 180
    sget-object v6, Lzb/a;->a:Lzb/a;

    .line 181
    .line 182
    if-eqz v1, :cond_a

    .line 183
    .line 184
    if-eq v1, v3, :cond_9

    .line 185
    .line 186
    if-ne v1, v2, :cond_8

    .line 187
    .line 188
    iget-object v1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, Li7/h2;

    .line 191
    .line 192
    iget-object v2, v0, Li7/i;->h:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v2, Li7/l0;

    .line 195
    .line 196
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    move-object v6, v2

    .line 200
    move-object/from16 v2, p1

    .line 201
    .line 202
    goto :goto_7

    .line 203
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 204
    .line 205
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 206
    .line 207
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    throw v1

    .line 211
    :cond_9
    iget-object v1, v0, Li7/i;->h:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v1, Li7/l0;

    .line 214
    .line 215
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    move-object/from16 v7, p1

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_a
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object v1, v0, Li7/i;->h:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v1, Li7/l0;

    .line 227
    .line 228
    if-eqz v1, :cond_b

    .line 229
    .line 230
    iget-object v7, v1, Li7/l0;->a:Li7/d1;

    .line 231
    .line 232
    iget-object v7, v7, Li7/d1;->b:Li7/h2;

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_b
    move-object v7, v5

    .line 236
    :goto_5
    iput-object v1, v0, Li7/i;->h:Ljava/lang/Object;

    .line 237
    .line 238
    iput v3, v0, Li7/i;->f:I

    .line 239
    .line 240
    invoke-static {v4, v7, v0}, Li7/o0;->a(Li7/o0;Li7/h2;Lac/c;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    if-ne v7, v6, :cond_c

    .line 245
    .line 246
    goto/16 :goto_e

    .line 247
    .line 248
    :cond_c
    :goto_6
    check-cast v7, Li7/h2;

    .line 249
    .line 250
    if-eqz v1, :cond_e

    .line 251
    .line 252
    iget-object v8, v1, Li7/l0;->a:Li7/d1;

    .line 253
    .line 254
    iput-object v1, v0, Li7/i;->h:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v7, v0, Li7/i;->g:Ljava/lang/Object;

    .line 257
    .line 258
    iput v2, v0, Li7/i;->f:I

    .line 259
    .line 260
    invoke-virtual {v8, v0}, Li7/d1;->e(Lac/c;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    if-ne v2, v6, :cond_d

    .line 265
    .line 266
    goto/16 :goto_e

    .line 267
    .line 268
    :cond_d
    move-object v6, v1

    .line 269
    move-object v1, v7

    .line 270
    :goto_7
    check-cast v2, Li7/i2;

    .line 271
    .line 272
    move-object v11, v1

    .line 273
    move-object v1, v6

    .line 274
    goto :goto_8

    .line 275
    :cond_e
    move-object v2, v5

    .line 276
    move-object v11, v7

    .line 277
    :goto_8
    if-eqz v2, :cond_f

    .line 278
    .line 279
    iget-object v6, v2, Li7/i2;->a:Ljava/util/List;

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_f
    move-object v6, v5

    .line 283
    :goto_9
    check-cast v6, Ljava/util/Collection;

    .line 284
    .line 285
    if-eqz v6, :cond_10

    .line 286
    .line 287
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-eqz v6, :cond_11

    .line 292
    .line 293
    :cond_10
    if-eqz v1, :cond_11

    .line 294
    .line 295
    iget-object v6, v1, Li7/l0;->b:Li7/i2;

    .line 296
    .line 297
    if-eqz v6, :cond_11

    .line 298
    .line 299
    iget-object v7, v6, Li7/i2;->a:Ljava/util/List;

    .line 300
    .line 301
    check-cast v7, Ljava/util/Collection;

    .line 302
    .line 303
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v7

    .line 307
    xor-int/2addr v7, v3

    .line 308
    if-ne v7, v3, :cond_11

    .line 309
    .line 310
    move-object v2, v6

    .line 311
    :cond_11
    if-eqz v2, :cond_12

    .line 312
    .line 313
    iget-object v3, v2, Li7/i2;->b:Ljava/lang/Integer;

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_12
    move-object v3, v5

    .line 317
    :goto_a
    if-nez v3, :cond_14

    .line 318
    .line 319
    if-eqz v1, :cond_13

    .line 320
    .line 321
    iget-object v3, v1, Li7/l0;->b:Li7/i2;

    .line 322
    .line 323
    if-eqz v3, :cond_13

    .line 324
    .line 325
    iget-object v3, v3, Li7/i2;->b:Ljava/lang/Integer;

    .line 326
    .line 327
    goto :goto_b

    .line 328
    :cond_13
    move-object v3, v5

    .line 329
    :goto_b
    if-eqz v3, :cond_14

    .line 330
    .line 331
    iget-object v2, v1, Li7/l0;->b:Li7/i2;

    .line 332
    .line 333
    :cond_14
    move-object v12, v2

    .line 334
    if-nez v12, :cond_16

    .line 335
    .line 336
    iget-object v2, v4, Li7/o0;->b:Ljava/lang/Integer;

    .line 337
    .line 338
    :cond_15
    :goto_c
    move-object v13, v2

    .line 339
    goto :goto_d

    .line 340
    :cond_16
    invoke-virtual {v11, v12}, Li7/h2;->a(Li7/i2;)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    sget-object v3, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 345
    .line 346
    if-eqz v3, :cond_15

    .line 347
    .line 348
    const-string v3, "Paging"

    .line 349
    .line 350
    const/4 v6, 0x3

    .line 351
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 352
    .line 353
    .line 354
    move-result v6

    .line 355
    if-eqz v6, :cond_15

    .line 356
    .line 357
    new-instance v6, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    const-string v7, "Refresh key "

    .line 360
    .line 361
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    const-string v7, " returned from PagingSource "

    .line 368
    .line 369
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    const-string v7, "message"

    .line 380
    .line 381
    invoke-static {v6, v7}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v3, v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 385
    .line 386
    .line 387
    goto :goto_c

    .line 388
    :goto_d
    if-eqz v1, :cond_17

    .line 389
    .line 390
    iget-object v2, v1, Li7/l0;->a:Li7/d1;

    .line 391
    .line 392
    iget-object v2, v2, Li7/d1;->i:Lhf/f1;

    .line 393
    .line 394
    invoke-virtual {v2, v5}, Lhf/k1;->g(Ljava/util/concurrent/CancellationException;)V

    .line 395
    .line 396
    .line 397
    :cond_17
    if-eqz v1, :cond_18

    .line 398
    .line 399
    iget-object v1, v1, Li7/l0;->c:Lhf/f1;

    .line 400
    .line 401
    invoke-virtual {v1, v5}, Lhf/k1;->g(Ljava/util/concurrent/CancellationException;)V

    .line 402
    .line 403
    .line 404
    :cond_18
    new-instance v1, Li7/l0;

    .line 405
    .line 406
    iget-object v14, v4, Li7/o0;->c:Li7/j1;

    .line 407
    .line 408
    iget-object v2, v4, Li7/o0;->e:Landroidx/media3/exoplayer/offline/u;

    .line 409
    .line 410
    iget-object v2, v2, Landroidx/media3/exoplayer/offline/u;->c:Ljava/lang/Object;

    .line 411
    .line 412
    move-object v15, v2

    .line 413
    check-cast v15, Li7/n;

    .line 414
    .line 415
    new-instance v2, Ld/i0;

    .line 416
    .line 417
    const/4 v9, 0x0

    .line 418
    const/4 v10, 0x2

    .line 419
    const/4 v3, 0x0

    .line 420
    const-class v5, Li7/o0;

    .line 421
    .line 422
    const-string v6, "refresh"

    .line 423
    .line 424
    const-string v7, "refresh()V"

    .line 425
    .line 426
    const/4 v8, 0x0

    .line 427
    invoke-direct/range {v2 .. v10}, Ld/i0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 428
    .line 429
    .line 430
    new-instance v6, Li7/d1;

    .line 431
    .line 432
    move-object v8, v11

    .line 433
    move-object v11, v12

    .line 434
    move-object v7, v13

    .line 435
    move-object v9, v14

    .line 436
    move-object v10, v15

    .line 437
    move-object v12, v2

    .line 438
    invoke-direct/range {v6 .. v12}, Li7/d1;-><init>(Ljava/lang/Object;Li7/h2;Li7/j1;Li7/n;Li7/i2;Ld/i0;)V

    .line 439
    .line 440
    .line 441
    invoke-static {}, Lhf/a0;->c()Lhf/f1;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-direct {v1, v6, v11, v2}, Li7/l0;-><init>(Li7/d1;Li7/i2;Lhf/f1;)V

    .line 446
    .line 447
    .line 448
    move-object v6, v1

    .line 449
    :goto_e
    return-object v6

    .line 450
    :pswitch_2
    iget v1, v0, Li7/i;->f:I

    .line 451
    .line 452
    const/4 v2, 0x1

    .line 453
    if-eqz v1, :cond_1a

    .line 454
    .line 455
    if-ne v1, v2, :cond_19

    .line 456
    .line 457
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    goto :goto_f

    .line 461
    :cond_19
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 462
    .line 463
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 464
    .line 465
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    throw v1

    .line 469
    :cond_1a
    invoke-static/range {p1 .. p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    iget-object v1, v0, Li7/i;->g:Ljava/lang/Object;

    .line 473
    .line 474
    check-cast v1, Llf/g;

    .line 475
    .line 476
    iget-object v3, v0, Li7/i;->h:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v3, Li7/l1;

    .line 479
    .line 480
    new-instance v4, Li7/e0;

    .line 481
    .line 482
    iget-object v5, v0, Li7/i;->i:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v5, Lk4/a;

    .line 485
    .line 486
    invoke-direct {v4, v5, v3}, Li7/e0;-><init>(Lk4/a;Li7/l1;)V

    .line 487
    .line 488
    .line 489
    iput v2, v0, Li7/i;->f:I

    .line 490
    .line 491
    invoke-interface {v1, v4, v0}, Llf/g;->n(Ljava/lang/Object;Lyb/c;)Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    sget-object v2, Lzb/a;->a:Lzb/a;

    .line 496
    .line 497
    if-ne v1, v2, :cond_1b

    .line 498
    .line 499
    goto :goto_10

    .line 500
    :cond_1b
    :goto_f
    sget-object v2, Lub/a0;->a:Lub/a0;

    .line 501
    .line 502
    :goto_10
    return-object v2

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
.end method
