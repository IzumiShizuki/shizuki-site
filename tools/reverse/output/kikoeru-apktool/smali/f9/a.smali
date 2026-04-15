.class public final Lf9/a;
.super Lac/i;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic e:I

.field public f:Ljava/io/Serializable;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:I

.field public j:I

.field public synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILyb/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lf9/a;->e:I

    invoke-direct {p0, p1, p2}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method

.method public constructor <init>(Lic/k;Ljava/lang/String;Lyb/c;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lf9/a;->e:I

    .line 2
    iput-object p1, p0, Lf9/a;->g:Ljava/lang/Object;

    iput-object p2, p0, Lf9/a;->h:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lac/i;-><init>(ILyb/c;)V

    return-void
.end method


# virtual methods
.method public final o(Ljava/lang/Object;Lyb/c;)Lyb/c;
    .locals 3

    .line 1
    iget v0, p0, Lf9/a;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf9/a;

    .line 7
    .line 8
    iget-object v1, p0, Lf9/a;->g:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lic/k;

    .line 11
    .line 12
    iget-object v2, p0, Lf9/a;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, p2}, Lf9/a;-><init>(Lic/k;Ljava/lang/String;Lyb/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lf9/a;->k:Ljava/lang/Object;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, Lf9/a;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v0, v1, p2, v2}, Lf9/a;-><init>(ILyb/c;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, Lf9/a;->k:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    :pswitch_1
    new-instance v0, Lf9/a;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v0, v1, p2, v2}, Lf9/a;-><init>(ILyb/c;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v0, Lf9/a;->k:Ljava/lang/Object;

    .line 40
    .line 41
    return-object v0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf9/a;->e:I

    .line 2
    .line 3
    check-cast p1, Lhf/y;

    .line 4
    .line 5
    check-cast p2, Lyb/c;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lf9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lf9/a;

    .line 15
    .line 16
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lf9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lf9/a;

    .line 28
    .line 29
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Lf9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lf9/a;->o(Ljava/lang/Object;Lyb/c;)Lyb/c;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lf9/a;

    .line 41
    .line 42
    sget-object p2, Lub/a0;->a:Lub/a0;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lf9/a;->u(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
.end method

.method public final u(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lf9/a;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0xa

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    sget-object v5, Lzb/a;->a:Lzb/a;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lhf/y;

    .line 18
    .line 19
    iget v0, p0, Lf9/a;->j:I

    .line 20
    .line 21
    sget-object v1, Lub/a0;->a:Lub/a0;

    .line 22
    .line 23
    const/4 v2, 0x2

    .line 24
    const/4 v7, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    if-eq v0, v6, :cond_1

    .line 28
    .line 29
    if-ne v0, v2, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    check-cast v0, Lhf/y;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    iget v3, p0, Lf9/a;->i:I

    .line 51
    .line 52
    iget-object v0, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 53
    .line 54
    check-cast v0, Ljava/lang/String;

    .line 55
    .line 56
    :try_start_1
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lf9/a;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lic/k;

    .line 66
    .line 67
    iget-object v0, p0, Lf9/a;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    :try_start_2
    iput-object v7, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v0, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 74
    .line 75
    iput v3, p0, Lf9/a;->i:I

    .line 76
    .line 77
    iput v6, p0, Lf9/a;->j:I

    .line 78
    .line 79
    invoke-interface {p1, p0}, Lic/k;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v5, :cond_3

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_3
    :goto_0
    check-cast p1, Landroid/net/Uri;

    .line 87
    .line 88
    sget-object v4, Lj9/b0;->a:Lj9/b0;

    .line 89
    .line 90
    iput-object v7, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v7, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 93
    .line 94
    iput v3, p0, Lf9/a;->i:I

    .line 95
    .line 96
    iput v2, p0, Lf9/a;->j:I

    .line 97
    .line 98
    sget-object v2, Lhf/l0;->a:Lpf/e;

    .line 99
    .line 100
    sget-object v2, Lpf/d;->c:Lpf/d;

    .line 101
    .line 102
    new-instance v3, Le/j;

    .line 103
    .line 104
    const/16 v4, 0xb

    .line 105
    .line 106
    invoke-direct {v3, p1, v0, v7, v4}, Le/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v3, p0}, Lhf/a0;->H(Lyb/h;Lic/n;Lyb/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 113
    if-ne p1, v5, :cond_4

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_4
    move-object p1, v1

    .line 117
    :goto_1
    if-ne p1, v5, :cond_5

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_5
    :goto_2
    move-object p1, v1

    .line 121
    goto :goto_4

    .line 122
    :goto_3
    invoke-static {p1}, Lub/a;->b(Ljava/lang/Throwable;)Lub/m;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :goto_4
    invoke-static {p1}, Lub/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-eqz p1, :cond_6

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 133
    .line 134
    .line 135
    :cond_6
    move-object v5, v1

    .line 136
    :goto_5
    return-object v5

    .line 137
    :pswitch_0
    iget-object v0, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, Lhf/y;

    .line 140
    .line 141
    iget v7, p0, Lf9/a;->j:I

    .line 142
    .line 143
    const/4 v12, 0x0

    .line 144
    if-eqz v7, :cond_8

    .line 145
    .line 146
    if-ne v7, v6, :cond_7

    .line 147
    .line 148
    iget v0, p0, Lf9/a;->i:I

    .line 149
    .line 150
    iget-object v1, p0, Lf9/a;->h:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Ljava/util/Iterator;

    .line 153
    .line 154
    iget-object v2, p0, Lf9/a;->g:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 157
    .line 158
    iget-object v3, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 159
    .line 160
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 161
    .line 162
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move p1, v0

    .line 166
    goto :goto_7

    .line 167
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p1

    .line 173
    :cond_8
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    new-instance v10, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 177
    .line 178
    invoke-direct {v10, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 179
    .line 180
    .line 181
    new-instance v11, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 182
    .line 183
    invoke-direct {v11, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Lcom/cnl/kikoeru/data/db/AppDatabase;->t()Ld9/o;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object p1, p1, Ld9/o;->a:Ln7/v;

    .line 195
    .line 196
    new-instance v4, Ld9/i;

    .line 197
    .line 198
    const/4 v7, 0x4

    .line 199
    invoke-direct {v4, v7}, Ld9/i;-><init>(I)V

    .line 200
    .line 201
    .line 202
    invoke-static {p1, v6, v3, v4}, Lua/l;->W(Ln7/v;ZZLic/k;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    check-cast p1, Ljava/util/List;

    .line 207
    .line 208
    check-cast p1, Ljava/lang/Iterable;

    .line 209
    .line 210
    new-instance v4, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-static {p1, v2}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_9

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    move-object v9, v2

    .line 234
    check-cast v9, Lc9/d;

    .line 235
    .line 236
    new-instance v8, Lf7/o;

    .line 237
    .line 238
    const/4 v13, 0x2

    .line 239
    invoke-direct/range {v8 .. v13}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 240
    .line 241
    .line 242
    invoke-static {v0, v12, v12, v8, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_6

    .line 250
    :cond_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    move-object v1, p1

    .line 255
    move-object v3, v10

    .line 256
    move-object v2, v11

    .line 257
    const/4 p1, 0x0

    .line 258
    :cond_a
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_b

    .line 263
    .line 264
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    check-cast v0, Lhf/d1;

    .line 269
    .line 270
    iput-object v12, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 271
    .line 272
    iput-object v3, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 273
    .line 274
    iput-object v2, p0, Lf9/a;->g:Ljava/lang/Object;

    .line 275
    .line 276
    iput-object v1, p0, Lf9/a;->h:Ljava/lang/Object;

    .line 277
    .line 278
    iput p1, p0, Lf9/a;->i:I

    .line 279
    .line 280
    iput v6, p0, Lf9/a;->j:I

    .line 281
    .line 282
    invoke-interface {v0, p0}, Lhf/d1;->Y(Lac/c;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-ne v0, v5, :cond_a

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_b
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 290
    .line 291
    .line 292
    move-result p1

    .line 293
    new-instance v0, Ljava/lang/Integer;

    .line 294
    .line 295
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    new-instance v1, Ljava/lang/Integer;

    .line 303
    .line 304
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 305
    .line 306
    .line 307
    new-instance v5, Lub/k;

    .line 308
    .line 309
    invoke-direct {v5, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :goto_8
    return-object v5

    .line 313
    :pswitch_1
    iget-object v0, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Lhf/y;

    .line 316
    .line 317
    iget v7, p0, Lf9/a;->j:I

    .line 318
    .line 319
    const/4 v12, 0x0

    .line 320
    if-eqz v7, :cond_d

    .line 321
    .line 322
    if-ne v7, v6, :cond_c

    .line 323
    .line 324
    iget v0, p0, Lf9/a;->i:I

    .line 325
    .line 326
    iget-object v1, p0, Lf9/a;->h:Ljava/lang/Object;

    .line 327
    .line 328
    check-cast v1, Ljava/util/Iterator;

    .line 329
    .line 330
    iget-object v2, p0, Lf9/a;->g:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 333
    .line 334
    iget-object v3, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 335
    .line 336
    check-cast v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 337
    .line 338
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    move p1, v0

    .line 342
    goto :goto_a

    .line 343
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 344
    .line 345
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw p1

    .line 349
    :cond_d
    invoke-static {p1}, Lub/a;->f(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    new-instance v10, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 353
    .line 354
    invoke-direct {v10, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 355
    .line 356
    .line 357
    new-instance v11, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 358
    .line 359
    invoke-direct {v11, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-static {}, La9/i;->c()Lcom/cnl/kikoeru/data/db/AppDatabase;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-virtual {p1}, Lcom/cnl/kikoeru/data/db/AppDatabase;->s()Ld9/m;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-virtual {p1}, Ld9/m;->a()Ljava/util/List;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    check-cast p1, Ljava/lang/Iterable;

    .line 375
    .line 376
    new-instance v4, Ljava/util/ArrayList;

    .line 377
    .line 378
    invoke-static {p1, v2}, Lvb/n;->K(Ljava/lang/Iterable;I)I

    .line 379
    .line 380
    .line 381
    move-result v2

    .line 382
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 383
    .line 384
    .line 385
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-eqz v2, :cond_e

    .line 394
    .line 395
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    move-object v9, v2

    .line 400
    check-cast v9, Lc9/c;

    .line 401
    .line 402
    new-instance v8, Lf7/o;

    .line 403
    .line 404
    const/4 v13, 0x1

    .line 405
    invoke-direct/range {v8 .. v13}, Lf7/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lyb/c;I)V

    .line 406
    .line 407
    .line 408
    invoke-static {v0, v12, v12, v8, v1}, Lhf/a0;->y(Lhf/y;Lyb/h;Lhf/z;Lic/n;I)Lhf/r1;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    goto :goto_9

    .line 416
    :cond_e
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    move-object v1, p1

    .line 421
    move-object v3, v10

    .line 422
    move-object v2, v11

    .line 423
    const/4 p1, 0x0

    .line 424
    :cond_f
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 425
    .line 426
    .line 427
    move-result v0

    .line 428
    if-eqz v0, :cond_10

    .line 429
    .line 430
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    check-cast v0, Lhf/d1;

    .line 435
    .line 436
    iput-object v12, p0, Lf9/a;->k:Ljava/lang/Object;

    .line 437
    .line 438
    iput-object v3, p0, Lf9/a;->f:Ljava/io/Serializable;

    .line 439
    .line 440
    iput-object v2, p0, Lf9/a;->g:Ljava/lang/Object;

    .line 441
    .line 442
    iput-object v1, p0, Lf9/a;->h:Ljava/lang/Object;

    .line 443
    .line 444
    iput p1, p0, Lf9/a;->i:I

    .line 445
    .line 446
    iput v6, p0, Lf9/a;->j:I

    .line 447
    .line 448
    invoke-interface {v0, p0}, Lhf/d1;->Y(Lac/c;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    if-ne v0, v5, :cond_f

    .line 453
    .line 454
    goto :goto_b

    .line 455
    :cond_10
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 456
    .line 457
    .line 458
    move-result p1

    .line 459
    new-instance v0, Ljava/lang/Integer;

    .line 460
    .line 461
    invoke-direct {v0, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    new-instance v1, Ljava/lang/Integer;

    .line 469
    .line 470
    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    .line 471
    .line 472
    .line 473
    new-instance v5, Lub/k;

    .line 474
    .line 475
    invoke-direct {v5, v0, v1}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :goto_b
    return-object v5

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
