.class public final Lc0/a;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lb0/r;


# instance fields
.field public final a:Lc0/z;


# direct methods
.method public constructor <init>(Lc0/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc0/a;->a:Lc0/z;

    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/a;->a:Lc0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc0/z;->g()Lc0/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lc0/o;->l:I

    .line 8
    .line 9
    return v0
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

.method public final b()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/a;->a:Lc0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc0/z;->g()Lc0/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lc0/o;->m:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Lvb/m;->h0(Ljava/util/List;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lc0/r;

    .line 14
    .line 15
    iget v0, v0, Lc0/r;->a:I

    .line 16
    .line 17
    return v0
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

.method public final c()I
    .locals 12

    .line 1
    iget-object v0, p0, Lc0/a;->a:Lc0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc0/z;->g()Lc0/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lc0/o;->m:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    invoke-virtual {v0}, Lc0/z;->g()Lc0/o;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v3, Lc0/q;->a:Lc0/o;

    .line 22
    .line 23
    iget-object v3, v1, Lc0/o;->u:Lu/e1;

    .line 24
    .line 25
    iget-wide v4, v1, Lc0/o;->n:J

    .line 26
    .line 27
    sget-object v1, Lu/e1;->a:Lu/e1;

    .line 28
    .line 29
    const/16 v6, 0x20

    .line 30
    .line 31
    const-wide v7, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    if-ne v3, v1, :cond_1

    .line 37
    .line 38
    and-long/2addr v4, v7

    .line 39
    long-to-int v3, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    shr-long v3, v4, v6

    .line 42
    .line 43
    long-to-int v3, v3

    .line 44
    :goto_0
    invoke-virtual {v0}, Lc0/z;->g()Lc0/o;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v4, v0, Lc0/o;->m:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    goto :goto_4

    .line 57
    :cond_2
    move-object v5, v4

    .line 58
    check-cast v5, Ljava/util/Collection;

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v9, 0x0

    .line 65
    :goto_1
    if-ge v2, v5, :cond_4

    .line 66
    .line 67
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    check-cast v10, Lc0/r;

    .line 72
    .line 73
    iget-object v11, v0, Lc0/o;->u:Lu/e1;

    .line 74
    .line 75
    if-ne v11, v1, :cond_3

    .line 76
    .line 77
    iget-wide v10, v10, Lc0/r;->s:J

    .line 78
    .line 79
    and-long/2addr v10, v7

    .line 80
    :goto_2
    long-to-int v11, v10

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    iget-wide v10, v10, Lc0/r;->s:J

    .line 83
    .line 84
    shr-long/2addr v10, v6

    .line 85
    goto :goto_2

    .line 86
    :goto_3
    add-int/2addr v9, v11

    .line 87
    add-int/lit8 v2, v2, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    div-int/2addr v9, v1

    .line 95
    iget v0, v0, Lc0/o;->s:I

    .line 96
    .line 97
    add-int v2, v9, v0

    .line 98
    .line 99
    :goto_4
    const/4 v0, 0x1

    .line 100
    if-nez v2, :cond_5

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_5
    div-int/2addr v3, v2

    .line 104
    if-ge v3, v0, :cond_6

    .line 105
    .line 106
    :goto_5
    return v0

    .line 107
    :cond_6
    return v3
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
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/a;->a:Lc0/z;

    .line 2
    .line 3
    invoke-virtual {v0}, Lc0/z;->g()Lc0/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lc0/o;->m:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/Collection;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    xor-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    return v0
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

.method public final e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc0/a;->a:Lc0/z;

    .line 2
    .line 3
    iget-object v0, v0, Lc0/z;->c:Lc0/s;

    .line 4
    .line 5
    iget-object v0, v0, Lc0/s;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lx0/b1;

    .line 8
    .line 9
    invoke-virtual {v0}, Lx0/b1;->e()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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
