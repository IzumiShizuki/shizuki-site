.class public final Li8/o;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ls8/i;

.field public final b:Li8/u;

.field public final c:Lh8/h;


# direct methods
.method public constructor <init>(Ls8/i;Li8/u;Lh8/h;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li8/o;->a:Ls8/i;

    .line 5
    .line 6
    iput-object p2, p0, Li8/o;->b:Li8/u;

    .line 7
    .line 8
    iput-object p3, p0, Li8/o;->c:Lh8/h;

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


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Li8/o;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    check-cast p1, Li8/o;

    .line 10
    .line 11
    iget-object v0, p1, Li8/o;->a:Ls8/i;

    .line 12
    .line 13
    iget-object v1, p0, Li8/o;->b:Li8/u;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Li8/o;->a:Ls8/i;

    .line 19
    .line 20
    if-ne v1, v0, :cond_1

    .line 21
    .line 22
    goto/16 :goto_0

    .line 23
    .line 24
    :cond_1
    iget-object v2, v1, Ls8/i;->a:Landroid/content/Context;

    .line 25
    .line 26
    iget-object v3, v0, Ls8/i;->a:Landroid/content/Context;

    .line 27
    .line 28
    invoke-static {v2, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    iget-object v2, v1, Ls8/i;->b:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object v3, v0, Ls8/i;->b:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    iget-object v2, v1, Ls8/i;->d:Landroid/graphics/Bitmap$Config;

    .line 45
    .line 46
    iget-object v3, v0, Ls8/i;->d:Landroid/graphics/Bitmap$Config;

    .line 47
    .line 48
    if-ne v2, v3, :cond_2

    .line 49
    .line 50
    iget-object v2, v1, Ls8/i;->f:Ljava/util/List;

    .line 51
    .line 52
    iget-object v3, v0, Ls8/i;->f:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v2, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    iget-object v2, v1, Ls8/i;->h:Lug/r;

    .line 61
    .line 62
    iget-object v3, v0, Ls8/i;->h:Lug/r;

    .line 63
    .line 64
    invoke-static {v2, v3}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    iget-boolean v2, v1, Ls8/i;->j:Z

    .line 71
    .line 72
    iget-boolean v3, v0, Ls8/i;->j:Z

    .line 73
    .line 74
    if-ne v2, v3, :cond_2

    .line 75
    .line 76
    iget-boolean v2, v1, Ls8/i;->k:Z

    .line 77
    .line 78
    iget-boolean v3, v0, Ls8/i;->k:Z

    .line 79
    .line 80
    if-ne v2, v3, :cond_2

    .line 81
    .line 82
    iget-boolean v2, v1, Ls8/i;->l:Z

    .line 83
    .line 84
    iget-boolean v3, v0, Ls8/i;->l:Z

    .line 85
    .line 86
    if-ne v2, v3, :cond_2

    .line 87
    .line 88
    iget-boolean v2, v1, Ls8/i;->m:Z

    .line 89
    .line 90
    iget-boolean v3, v0, Ls8/i;->m:Z

    .line 91
    .line 92
    if-ne v2, v3, :cond_2

    .line 93
    .line 94
    iget-object v2, v1, Ls8/i;->n:Ls8/b;

    .line 95
    .line 96
    iget-object v3, v0, Ls8/i;->n:Ls8/b;

    .line 97
    .line 98
    if-ne v2, v3, :cond_2

    .line 99
    .line 100
    iget-object v2, v1, Ls8/i;->o:Ls8/b;

    .line 101
    .line 102
    iget-object v3, v0, Ls8/i;->o:Ls8/b;

    .line 103
    .line 104
    if-ne v2, v3, :cond_2

    .line 105
    .line 106
    iget-object v2, v1, Ls8/i;->p:Ls8/b;

    .line 107
    .line 108
    iget-object v3, v0, Ls8/i;->p:Ls8/b;

    .line 109
    .line 110
    if-ne v2, v3, :cond_2

    .line 111
    .line 112
    iget-object v2, v1, Ls8/i;->v:Lt8/i;

    .line 113
    .line 114
    iget-object v3, v0, Ls8/i;->v:Lt8/i;

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_2

    .line 121
    .line 122
    iget-object v2, v1, Ls8/i;->w:Lt8/g;

    .line 123
    .line 124
    iget-object v3, v0, Ls8/i;->w:Lt8/g;

    .line 125
    .line 126
    if-ne v2, v3, :cond_2

    .line 127
    .line 128
    iget-object v2, v1, Ls8/i;->e:Lt8/d;

    .line 129
    .line 130
    iget-object v3, v0, Ls8/i;->e:Lt8/d;

    .line 131
    .line 132
    if-ne v2, v3, :cond_2

    .line 133
    .line 134
    iget-object v1, v1, Ls8/i;->x:Ls8/n;

    .line 135
    .line 136
    iget-object v0, v0, Ls8/i;->x:Ls8/n;

    .line 137
    .line 138
    invoke-virtual {v1, v0}, Ls8/n;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_2

    .line 143
    .line 144
    :goto_0
    iget-object v0, p0, Li8/o;->c:Lh8/h;

    .line 145
    .line 146
    iget-object p1, p1, Li8/o;->c:Lh8/h;

    .line 147
    .line 148
    invoke-static {v0, p1}, Ljc/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_2

    .line 153
    .line 154
    :goto_1
    const/4 p1, 0x1

    .line 155
    return p1

    .line 156
    :cond_2
    const/4 p1, 0x0

    .line 157
    return p1
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
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget-object v0, p0, Li8/o;->b:Li8/u;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li8/o;->a:Ls8/i;

    .line 7
    .line 8
    iget-object v1, v0, Ls8/i;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/16 v2, 0x1f

    .line 15
    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v3, v0, Ls8/i;->b:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    add-int/2addr v3, v1

    .line 25
    const v1, 0xe1781

    .line 26
    .line 27
    .line 28
    mul-int v3, v3, v1

    .line 29
    .line 30
    iget-object v1, v0, Ls8/i;->d:Landroid/graphics/Bitmap$Config;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    add-int/2addr v1, v3

    .line 37
    mul-int/lit16 v1, v1, 0x3c1

    .line 38
    .line 39
    iget-object v3, v0, Ls8/i;->f:Ljava/util/List;

    .line 40
    .line 41
    invoke-static {v1, v2, v3}, Lq/t0;->z(IILjava/util/List;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-object v3, v0, Ls8/i;->h:Lug/r;

    .line 46
    .line 47
    iget-object v3, v3, Lug/r;->a:[Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v3}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    add-int/2addr v1, v3

    .line 54
    mul-int/lit8 v1, v1, 0x1f

    .line 55
    .line 56
    iget-boolean v3, v0, Ls8/i;->j:Z

    .line 57
    .line 58
    const/16 v4, 0x4d5

    .line 59
    .line 60
    const/16 v5, 0x4cf

    .line 61
    .line 62
    if-eqz v3, :cond_0

    .line 63
    .line 64
    const/16 v3, 0x4cf

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    const/16 v3, 0x4d5

    .line 68
    .line 69
    :goto_0
    add-int/2addr v1, v3

    .line 70
    mul-int/lit8 v1, v1, 0x1f

    .line 71
    .line 72
    iget-boolean v3, v0, Ls8/i;->k:Z

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    const/16 v3, 0x4cf

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    const/16 v3, 0x4d5

    .line 80
    .line 81
    :goto_1
    add-int/2addr v1, v3

    .line 82
    mul-int/lit8 v1, v1, 0x1f

    .line 83
    .line 84
    iget-boolean v3, v0, Ls8/i;->l:Z

    .line 85
    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    const/16 v3, 0x4cf

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_2
    const/16 v3, 0x4d5

    .line 92
    .line 93
    :goto_2
    add-int/2addr v1, v3

    .line 94
    mul-int/lit8 v1, v1, 0x1f

    .line 95
    .line 96
    iget-boolean v3, v0, Ls8/i;->m:Z

    .line 97
    .line 98
    if-eqz v3, :cond_3

    .line 99
    .line 100
    const/16 v4, 0x4cf

    .line 101
    .line 102
    :cond_3
    add-int/2addr v1, v4

    .line 103
    mul-int/lit8 v1, v1, 0x1f

    .line 104
    .line 105
    iget-object v3, v0, Ls8/i;->n:Ls8/b;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    add-int/2addr v3, v1

    .line 112
    mul-int/lit8 v3, v3, 0x1f

    .line 113
    .line 114
    iget-object v1, v0, Ls8/i;->o:Ls8/b;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    add-int/2addr v1, v3

    .line 121
    mul-int/lit8 v1, v1, 0x1f

    .line 122
    .line 123
    iget-object v3, v0, Ls8/i;->p:Ls8/b;

    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    add-int/2addr v3, v1

    .line 130
    mul-int/lit8 v3, v3, 0x1f

    .line 131
    .line 132
    iget-object v1, v0, Ls8/i;->v:Lt8/i;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    add-int/2addr v1, v3

    .line 139
    mul-int/lit8 v1, v1, 0x1f

    .line 140
    .line 141
    iget-object v3, v0, Ls8/i;->w:Lt8/g;

    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    add-int/2addr v3, v1

    .line 148
    mul-int/lit8 v3, v3, 0x1f

    .line 149
    .line 150
    iget-object v1, v0, Ls8/i;->e:Lt8/d;

    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    add-int/2addr v1, v3

    .line 157
    mul-int/lit8 v1, v1, 0x1f

    .line 158
    .line 159
    iget-object v0, v0, Ls8/i;->x:Ls8/n;

    .line 160
    .line 161
    iget-object v0, v0, Ls8/n;->a:Ljava/util/Map;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    add-int/2addr v0, v1

    .line 168
    mul-int/lit8 v0, v0, 0x1f

    .line 169
    .line 170
    iget-object v1, p0, Li8/o;->c:Lh8/h;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    add-int/2addr v1, v0

    .line 177
    return v1
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
