.class public final synthetic Lm0/r;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm0/x;


# direct methods
.method public synthetic constructor <init>(Lm0/x;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm0/r;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lm0/r;->b:Lm0/x;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.method public final b()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lm0/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 7
    .line 8
    iget-object v0, v0, Lm0/x;->g:Lx0/e1;

    .line 9
    .line 10
    invoke-virtual {v0}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 21
    .line 22
    invoke-virtual {v0}, Lm0/x;->f()F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :pswitch_1
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 32
    .line 33
    invoke-virtual {v0}, Lm0/x;->d()Lm0/a4;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v0, v0, Lm0/x;->h:Lx0/c0;

    .line 38
    .line 39
    invoke-virtual {v0}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v2, Lub/k;

    .line 44
    .line 45
    invoke-direct {v2, v1, v0}, Lub/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :pswitch_2
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 50
    .line 51
    invoke-virtual {v0}, Lm0/x;->d()Lm0/a4;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :pswitch_3
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 57
    .line 58
    invoke-virtual {v0}, Lm0/x;->d()Lm0/a4;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v2, v0, Lm0/x;->g:Lx0/e1;

    .line 63
    .line 64
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Lm0/a4;->c(Ljava/lang/Object;)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    invoke-virtual {v0}, Lm0/x;->d()Lm0/a4;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iget-object v3, v0, Lm0/x;->i:Lx0/c0;

    .line 77
    .line 78
    invoke-virtual {v3}, Lx0/c0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v2, v3}, Lm0/a4;->c(Ljava/lang/Object;)F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    sub-float/2addr v2, v1

    .line 87
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-nez v4, :cond_1

    .line 96
    .line 97
    const v4, 0x358637bd    # 1.0E-6f

    .line 98
    .line 99
    .line 100
    cmpl-float v3, v3, v4

    .line 101
    .line 102
    if-lez v3, :cond_1

    .line 103
    .line 104
    invoke-virtual {v0}, Lm0/x;->f()F

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    sub-float/2addr v0, v1

    .line 109
    div-float/2addr v0, v2

    .line 110
    cmpg-float v1, v0, v4

    .line 111
    .line 112
    if-gez v1, :cond_0

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    const v1, 0x3f7fffef    # 0.999999f

    .line 117
    .line 118
    .line 119
    cmpl-float v1, v0, v1

    .line 120
    .line 121
    if-lez v1, :cond_2

    .line 122
    .line 123
    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 124
    .line 125
    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :pswitch_4
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 131
    .line 132
    iget-object v1, v0, Lm0/x;->l:Lx0/e1;

    .line 133
    .line 134
    iget-object v2, v0, Lm0/x;->g:Lx0/e1;

    .line 135
    .line 136
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    if-nez v1, :cond_7

    .line 141
    .line 142
    iget-object v1, v0, Lm0/x;->j:Lx0/a1;

    .line 143
    .line 144
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-nez v3, :cond_6

    .line 153
    .line 154
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v0}, Lm0/x;->d()Lm0/a4;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0, v2}, Lm0/a4;->c(Ljava/lang/Object;)F

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    cmpg-float v4, v3, v1

    .line 167
    .line 168
    if-nez v4, :cond_3

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_4

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    if-gez v4, :cond_5

    .line 179
    .line 180
    const/4 v3, 0x1

    .line 181
    invoke-virtual {v0, v1, v3}, Lm0/a4;->b(FZ)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    if-nez v1, :cond_7

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_5
    const/4 v3, 0x0

    .line 189
    invoke-virtual {v0, v1, v3}, Lm0/a4;->b(FZ)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    if-nez v1, :cond_7

    .line 194
    .line 195
    :goto_1
    move-object v1, v2

    .line 196
    goto :goto_2

    .line 197
    :cond_6
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    :cond_7
    :goto_2
    return-object v1

    .line 202
    :pswitch_5
    iget-object v0, p0, Lm0/r;->b:Lm0/x;

    .line 203
    .line 204
    iget-object v1, v0, Lm0/x;->l:Lx0/e1;

    .line 205
    .line 206
    iget-object v2, v0, Lm0/x;->g:Lx0/e1;

    .line 207
    .line 208
    invoke-virtual {v1}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    if-nez v1, :cond_9

    .line 213
    .line 214
    iget-object v1, v0, Lm0/x;->j:Lx0/a1;

    .line 215
    .line 216
    invoke-virtual {v1}, Lx0/a1;->e()F

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-nez v3, :cond_8

    .line 225
    .line 226
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/4 v3, 0x0

    .line 231
    invoke-virtual {v0, v1, v3, v2}, Lm0/x;->c(FFLjava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    goto :goto_3

    .line 236
    :cond_8
    invoke-virtual {v2}, Lx0/e1;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    :cond_9
    :goto_3
    return-object v1

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
