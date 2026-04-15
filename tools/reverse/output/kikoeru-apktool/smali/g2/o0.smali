.class public final Lg2/o0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lg2/o1;


# instance fields
.field public final a:Lo/z;

.field public final synthetic b:Lg2/p0;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg2/p0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg2/o0;->b:Lg2/p0;

    .line 5
    .line 6
    iput-object p2, p0, Lg2/o0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p1, Lo/o;->a:[I

    .line 9
    .line 10
    new-instance p1, Lo/z;

    .line 11
    .line 12
    invoke-direct {p1}, Lo/z;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lg2/o0;->a:Lo/z;

    .line 16
    .line 17
    return-void
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
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    iget-object v0, p0, Lg2/o0;->b:Lg2/p0;

    .line 2
    .line 3
    iget-object v1, v0, Lg2/p0;->a:Li2/j0;

    .line 4
    .line 5
    invoke-virtual {v0}, Lg2/p0;->d()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lg2/p0;->j:Lo/k0;

    .line 9
    .line 10
    iget-object v3, p0, Lg2/o0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Lo/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Li2/j0;

    .line 17
    .line 18
    if-eqz v2, :cond_3

    .line 19
    .line 20
    iget v3, v0, Lg2/p0;->o:I

    .line 21
    .line 22
    if-lez v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string v3, "No pre-composed items to dispose"

    .line 26
    .line 27
    invoke-static {v3}, Lf2/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {v1}, Li2/j0;->o()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lz0/b;

    .line 35
    .line 36
    iget-object v3, v3, Lz0/b;->a:Lz0/e;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, Lz0/e;->i(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-virtual {v1}, Li2/j0;->o()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lz0/b;

    .line 47
    .line 48
    iget-object v4, v4, Lz0/b;->a:Lz0/e;

    .line 49
    .line 50
    iget v4, v4, Lz0/e;->c:I

    .line 51
    .line 52
    iget v5, v0, Lg2/p0;->o:I

    .line 53
    .line 54
    sub-int/2addr v4, v5

    .line 55
    if-lt v3, v4, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const-string v4, "Item is not in pre-composed item range"

    .line 59
    .line 60
    invoke-static {v4}, Lf2/a;->b(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    iget v4, v0, Lg2/p0;->n:I

    .line 64
    .line 65
    const/4 v5, 0x1

    .line 66
    add-int/2addr v4, v5

    .line 67
    iput v4, v0, Lg2/p0;->n:I

    .line 68
    .line 69
    iget v4, v0, Lg2/p0;->o:I

    .line 70
    .line 71
    add-int/lit8 v4, v4, -0x1

    .line 72
    .line 73
    iput v4, v0, Lg2/p0;->o:I

    .line 74
    .line 75
    iget-object v4, v0, Lg2/p0;->f:Lo/k0;

    .line 76
    .line 77
    invoke-virtual {v4, v2}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Lg2/i0;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-virtual {v1}, Li2/j0;->o()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lz0/b;

    .line 93
    .line 94
    iget-object v2, v2, Lz0/b;->a:Lz0/e;

    .line 95
    .line 96
    iget v2, v2, Lz0/e;->c:I

    .line 97
    .line 98
    iget v4, v0, Lg2/p0;->o:I

    .line 99
    .line 100
    sub-int/2addr v2, v4

    .line 101
    iget v4, v0, Lg2/p0;->n:I

    .line 102
    .line 103
    sub-int/2addr v2, v4

    .line 104
    iput-boolean v5, v1, Li2/j0;->q:Z

    .line 105
    .line 106
    invoke-virtual {v1, v3, v2, v5}, Li2/j0;->M(III)V

    .line 107
    .line 108
    .line 109
    const/4 v3, 0x0

    .line 110
    iput-boolean v3, v1, Li2/j0;->q:Z

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Lg2/p0;->c(I)V

    .line 113
    .line 114
    .line 115
    :cond_3
    return-void
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
.end method

.method public final b()I
    .locals 2

    .line 1
    iget-object v0, p0, Lg2/o0;->b:Lg2/p0;

    .line 2
    .line 3
    iget-object v0, v0, Lg2/p0;->j:Lo/k0;

    .line 4
    .line 5
    iget-object v1, p0, Lg2/o0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Li2/j0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Li2/j0;->n()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lz0/b;

    .line 20
    .line 21
    iget-object v0, v0, Lz0/b;->a:Lz0/e;

    .line 22
    .line 23
    iget v0, v0, Lz0/e;->c:I

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0
    .line 28
    .line 29
.end method

.method public final c(Lb0/u1;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lg2/o0;->b:Lg2/p0;

    .line 2
    .line 3
    iget-object v0, v0, Lg2/p0;->j:Lo/k0;

    .line 4
    .line 5
    iget-object v1, p0, Lg2/o0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Li2/j0;

    .line 12
    .line 13
    if-eqz v0, :cond_e

    .line 14
    .line 15
    iget-object v0, v0, Li2/j0;->F:Li2/d1;

    .line 16
    .line 17
    if-eqz v0, :cond_e

    .line 18
    .line 19
    iget-object v0, v0, Li2/d1;->f:Lj1/p;

    .line 20
    .line 21
    if-eqz v0, :cond_e

    .line 22
    .line 23
    iget-object v1, v0, Lj1/p;->a:Lj1/p;

    .line 24
    .line 25
    iget-boolean v1, v1, Lj1/p;->n:Z

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 30
    .line 31
    invoke-static {v1}, Lf2/a;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    new-instance v1, Lz0/e;

    .line 35
    .line 36
    const/16 v2, 0x10

    .line 37
    .line 38
    new-array v3, v2, [Lj1/p;

    .line 39
    .line 40
    invoke-direct {v1, v3}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v0, Lj1/p;->a:Lj1/p;

    .line 44
    .line 45
    iget-object v3, v0, Lj1/p;->f:Lj1/p;

    .line 46
    .line 47
    if-nez v3, :cond_1

    .line 48
    .line 49
    invoke-static {v1, v0}, Li2/f;->b(Lz0/e;Lj1/p;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {v1, v3}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_0
    iget v0, v1, Lz0/e;->c:I

    .line 57
    .line 58
    if-eqz v0, :cond_e

    .line 59
    .line 60
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Lz0/e;->k(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lj1/p;

    .line 67
    .line 68
    iget v3, v0, Lj1/p;->d:I

    .line 69
    .line 70
    const/high16 v4, 0x40000

    .line 71
    .line 72
    and-int/2addr v3, v4

    .line 73
    if-eqz v3, :cond_d

    .line 74
    .line 75
    move-object v3, v0

    .line 76
    :goto_1
    if-eqz v3, :cond_d

    .line 77
    .line 78
    iget v5, v3, Lj1/p;->c:I

    .line 79
    .line 80
    and-int/2addr v5, v4

    .line 81
    if-eqz v5, :cond_c

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    move-object v6, v3

    .line 85
    move-object v7, v5

    .line 86
    :goto_2
    if-eqz v6, :cond_c

    .line 87
    .line 88
    instance-of v8, v6, Li2/d2;

    .line 89
    .line 90
    if-eqz v8, :cond_5

    .line 91
    .line 92
    check-cast v6, Li2/d2;

    .line 93
    .line 94
    invoke-interface {v6}, Li2/d2;->k()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    const-string v9, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode"

    .line 99
    .line 100
    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    sget-object v9, Li2/c2;->b:Li2/c2;

    .line 105
    .line 106
    if-eqz v8, :cond_3

    .line 107
    .line 108
    invoke-virtual {p1, v6}, Lb0/u1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-object v6, v9

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    sget-object v6, Li2/c2;->a:Li2/c2;

    .line 114
    .line 115
    :goto_3
    sget-object v8, Li2/c2;->c:Li2/c2;

    .line 116
    .line 117
    if-ne v6, v8, :cond_4

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_4
    if-eq v6, v9, :cond_2

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_5
    iget v8, v6, Lj1/p;->c:I

    .line 124
    .line 125
    and-int/2addr v8, v4

    .line 126
    if-eqz v8, :cond_b

    .line 127
    .line 128
    instance-of v8, v6, Li2/n;

    .line 129
    .line 130
    if-eqz v8, :cond_b

    .line 131
    .line 132
    move-object v8, v6

    .line 133
    check-cast v8, Li2/n;

    .line 134
    .line 135
    iget-object v8, v8, Li2/n;->p:Lj1/p;

    .line 136
    .line 137
    const/4 v9, 0x0

    .line 138
    :goto_4
    const/4 v10, 0x1

    .line 139
    if-eqz v8, :cond_a

    .line 140
    .line 141
    iget v11, v8, Lj1/p;->c:I

    .line 142
    .line 143
    and-int/2addr v11, v4

    .line 144
    if-eqz v11, :cond_9

    .line 145
    .line 146
    add-int/lit8 v9, v9, 0x1

    .line 147
    .line 148
    if-ne v9, v10, :cond_6

    .line 149
    .line 150
    move-object v6, v8

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    if-nez v7, :cond_7

    .line 153
    .line 154
    new-instance v7, Lz0/e;

    .line 155
    .line 156
    new-array v10, v2, [Lj1/p;

    .line 157
    .line 158
    invoke-direct {v7, v10}, Lz0/e;-><init>([Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    if-eqz v6, :cond_8

    .line 162
    .line 163
    invoke-virtual {v7, v6}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object v6, v5

    .line 167
    :cond_8
    invoke-virtual {v7, v8}, Lz0/e;->b(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    :goto_5
    iget-object v8, v8, Lj1/p;->f:Lj1/p;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    if-ne v9, v10, :cond_b

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_b
    :goto_6
    invoke-static {v7}, Li2/f;->f(Lz0/e;)Lj1/p;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    goto :goto_2

    .line 181
    :cond_c
    iget-object v3, v3, Lj1/p;->f:Lj1/p;

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_d
    invoke-static {v1, v0}, Li2/f;->b(Lz0/e;Lj1/p;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_e
    :goto_7
    return-void
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
.end method

.method public final d(IJ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lg2/o0;->b:Lg2/p0;

    .line 2
    .line 3
    iget-object v1, v0, Lg2/p0;->j:Lo/k0;

    .line 4
    .line 5
    iget-object v2, p0, Lg2/o0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lo/k0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Li2/j0;

    .line 12
    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-virtual {v1}, Li2/j0;->I()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_3

    .line 20
    .line 21
    invoke-virtual {v1}, Li2/j0;->n()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lz0/b;

    .line 26
    .line 27
    iget-object v2, v2, Lz0/b;->a:Lz0/e;

    .line 28
    .line 29
    iget v2, v2, Lz0/e;->c:I

    .line 30
    .line 31
    if-ltz p1, :cond_0

    .line 32
    .line 33
    if-lt p1, v2, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v4, "Index ("

    .line 38
    .line 39
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v4, ") is out of bound of [0, "

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const/16 v2, 0x29

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, Lf2/a;->d(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-virtual {v1}, Li2/j0;->J()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_2

    .line 70
    .line 71
    const-string v2, "Pre-measure called on node that is not placed"

    .line 72
    .line 73
    invoke-static {v2}, Lf2/a;->a(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v0, v0, Lg2/p0;->a:Li2/j0;

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    iput-boolean v2, v0, Li2/j0;->q:Z

    .line 80
    .line 81
    invoke-static {v1}, Li2/m0;->a(Li2/j0;)Li2/p1;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1}, Li2/j0;->n()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lz0/b;

    .line 90
    .line 91
    invoke-virtual {v1, p1}, Lz0/b;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, Li2/j0;

    .line 96
    .line 97
    check-cast v2, Lj2/v;

    .line 98
    .line 99
    invoke-virtual {v2, v1, p2, p3}, Lj2/v;->z(Li2/j0;J)V

    .line 100
    .line 101
    .line 102
    const/4 p2, 0x0

    .line 103
    iput-boolean p2, v0, Li2/j0;->q:Z

    .line 104
    .line 105
    iget-object p2, p0, Lg2/o0;->a:Lo/z;

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Lo/z;->a(I)Z

    .line 108
    .line 109
    .line 110
    :cond_3
    return-void
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
.end method
