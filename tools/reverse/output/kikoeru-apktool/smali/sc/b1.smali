.class public final Lsc/b1;
.super Ljava/lang/Object;

# interfaces
.implements Lic/a;


# instance fields
.field public final synthetic a:I

.field public final b:Lsc/d1;


# direct methods
.method public synthetic constructor <init>(Lsc/d1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lsc/b1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lsc/b1;->b:Lsc/d1;

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
    .locals 9

    .line 1
    iget v0, p0, Lsc/b1;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lsc/b1;->b:Lsc/d1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lsc/q1;->u()Ljava/lang/reflect/Member;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v2, "delegate field/method "

    .line 13
    .line 14
    const-string v3, "delegate method "

    .line 15
    .line 16
    :try_start_0
    sget-object v4, Lsc/q1;->k:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1}, Lsc/q1;->t()Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    const/4 v6, 0x0

    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    iget-object v5, v1, Lsc/q1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v1}, Lsc/q1;->v()Lyc/k0;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v5, v7}, Ln7/e;->f(Ljava/lang/Object;Lyc/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object v5, v6

    .line 37
    :goto_0
    if-eq v5, v4, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v5, v6

    .line 41
    :goto_1
    move-object v4, v0

    .line 42
    check-cast v4, Ljava/lang/reflect/AccessibleObject;

    .line 43
    .line 44
    const/4 v7, 0x1

    .line 45
    const/4 v8, 0x0

    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/4 v4, 0x0

    .line 51
    :goto_2
    if-eqz v4, :cond_3

    .line 52
    .line 53
    move-object v4, v0

    .line 54
    check-cast v4, Ljava/lang/reflect/AccessibleObject;

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_3
    move-object v4, v6

    .line 61
    :goto_3
    if-eqz v4, :cond_4

    .line 62
    .line 63
    invoke-static {v1}, Ln7/d;->v(Lpc/b;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 68
    .line 69
    .line 70
    :cond_4
    if-nez v0, :cond_5

    .line 71
    .line 72
    goto/16 :goto_4

    .line 73
    .line 74
    :cond_5
    instance-of v1, v0, Ljava/lang/reflect/Field;

    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    check-cast v0, Ljava/lang/reflect/Field;

    .line 79
    .line 80
    invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    goto :goto_4

    .line 85
    :cond_6
    instance-of v1, v0, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    if-eqz v1, :cond_b

    .line 88
    .line 89
    move-object v1, v0

    .line 90
    check-cast v1, Ljava/lang/reflect/Method;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    array-length v1, v1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    if-eqz v1, :cond_a

    .line 98
    .line 99
    const-string v2, "get(...)"

    .line 100
    .line 101
    if-eq v1, v7, :cond_8

    .line 102
    .line 103
    const/4 v4, 0x2

    .line 104
    if-ne v1, v4, :cond_7

    .line 105
    .line 106
    :try_start_1
    move-object v1, v0

    .line 107
    check-cast v1, Ljava/lang/reflect/Method;

    .line 108
    .line 109
    check-cast v0, Ljava/lang/reflect/Method;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    aget-object v0, v0, v7

    .line 116
    .line 117
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v0}, Lsc/f2;->e(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    new-array v2, v4, [Ljava/lang/Object;

    .line 125
    .line 126
    aput-object v5, v2, v8

    .line 127
    .line 128
    aput-object v0, v2, v7

    .line 129
    .line 130
    invoke-virtual {v1, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    goto :goto_4

    .line 135
    :cond_7
    new-instance v1, Ljava/lang/AssertionError;

    .line 136
    .line 137
    new-instance v2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v0, " should take 0, 1, or 2 parameters"

    .line 146
    .line 147
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    throw v1

    .line 158
    :cond_8
    move-object v1, v0

    .line 159
    check-cast v1, Ljava/lang/reflect/Method;

    .line 160
    .line 161
    if-nez v5, :cond_9

    .line 162
    .line 163
    check-cast v0, Ljava/lang/reflect/Method;

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    aget-object v0, v0, v8

    .line 170
    .line 171
    invoke-static {v0, v2}, Ljc/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v0}, Lsc/f2;->e(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    :cond_9
    new-array v0, v7, [Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v5, v0, v8

    .line 181
    .line 182
    invoke-virtual {v1, v6, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    goto :goto_4

    .line 187
    :cond_a
    check-cast v0, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    invoke-virtual {v0, v6, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    :goto_4
    return-object v6

    .line 194
    :cond_b
    new-instance v1, Ljava/lang/AssertionError;

    .line 195
    .line 196
    new-instance v3, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    const-string v0, " neither field nor method"

    .line 205
    .line 206
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 217
    :goto_5
    new-instance v1, Lqc/a;

    .line 218
    .line 219
    const-string v2, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible"

    .line 220
    .line 221
    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw v1

    .line 225
    :pswitch_0
    new-instance v0, Lsc/c1;

    .line 226
    .line 227
    invoke-direct {v0, v1}, Lsc/c1;-><init>(Lsc/d1;)V

    .line 228
    .line 229
    .line 230
    return-object v0

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
