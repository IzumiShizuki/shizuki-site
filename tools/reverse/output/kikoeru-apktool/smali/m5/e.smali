.class public final synthetic Lm5/e;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lxa/e;


# instance fields
.field public final synthetic a:Lm5/p;


# direct methods
.method public synthetic constructor <init>(Lm5/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm5/e;->a:Lm5/p;

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
.method public final apply(Ljava/lang/Object;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lm5/e;->a:Lm5/p;

    .line 2
    .line 3
    check-cast p1, Lm4/q;

    .line 4
    .line 5
    iget-object v1, v0, Lm5/p;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Lm5/p;->g:Lm5/j;

    .line 9
    .line 10
    iget-boolean v2, v2, Lm5/j;->o0:Z

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v2, :cond_6

    .line 14
    .line 15
    iget-boolean v2, v0, Lm5/p;->f:Z

    .line 16
    .line 17
    if-nez v2, :cond_6

    .line 18
    .line 19
    iget v2, p1, Lm4/q;->D:I

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    if-eq v2, v4, :cond_6

    .line 23
    .line 24
    const/4 v5, 0x2

    .line 25
    if-le v2, v5, :cond_6

    .line 26
    .line 27
    iget-object v2, p1, Lm4/q;->n:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    const/16 v6, 0x20

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    sparse-switch v8, :sswitch_data_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :sswitch_0
    const-string v5, "audio/eac3"

    .line 44
    .line 45
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 v4, 0x3

    .line 53
    goto :goto_0

    .line 54
    :sswitch_1
    const-string v8, "audio/ac4"

    .line 55
    .line 56
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    const/4 v4, 0x2

    .line 64
    goto :goto_0

    .line 65
    :sswitch_2
    const-string v5, "audio/ac3"

    .line 66
    .line 67
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    const/4 v4, 0x1

    .line 75
    goto :goto_0

    .line 76
    :sswitch_3
    const-string v5, "audio/eac3-joc"

    .line 77
    .line 78
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    const/4 v4, 0x0

    .line 86
    :goto_0
    packed-switch v4, :pswitch_data_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_0
    :try_start_1
    sget v2, Lp4/c0;->a:I

    .line 91
    .line 92
    if-lt v2, v6, :cond_6

    .line 93
    .line 94
    iget-object v2, v0, Lm5/p;->h:Lb5/d0;

    .line 95
    .line 96
    if-eqz v2, :cond_6

    .line 97
    .line 98
    iget-boolean v2, v2, Lb5/d0;->a:Z

    .line 99
    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    :goto_1
    sget v2, Lp4/c0;->a:I

    .line 103
    .line 104
    if-lt v2, v6, :cond_5

    .line 105
    .line 106
    iget-object v2, v0, Lm5/p;->h:Lb5/d0;

    .line 107
    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    iget-boolean v4, v2, Lb5/d0;->a:Z

    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    iget-object v2, v2, Lb5/d0;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, Landroid/media/Spatializer;

    .line 117
    .line 118
    invoke-static {v2}, Lm4/c;->f(Landroid/media/Spatializer;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_5

    .line 123
    .line 124
    iget-object v2, v0, Lm5/p;->h:Lb5/d0;

    .line 125
    .line 126
    iget-object v2, v2, Lb5/d0;->b:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v2, Landroid/media/Spatializer;

    .line 129
    .line 130
    invoke-static {v2}, Lm4/c;->i(Landroid/media/Spatializer;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_5

    .line 135
    .line 136
    iget-object v2, v0, Lm5/p;->h:Lb5/d0;

    .line 137
    .line 138
    iget-object v0, v0, Lm5/p;->i:Lm4/d;

    .line 139
    .line 140
    invoke-virtual {v2, v0, p1}, Lb5/d0;->d(Lm4/d;Lm4/q;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_5

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :catchall_0
    move-exception p1

    .line 148
    goto :goto_3

    .line 149
    :cond_5
    const/4 v3, 0x0

    .line 150
    :cond_6
    :goto_2
    monitor-exit v1

    .line 151
    return v3

    .line 152
    :goto_3
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    throw p1

    .line 154
    nop

    .line 155
    :sswitch_data_0
    .sparse-switch
        -0x7e929daa -> :sswitch_3
        0xb269698 -> :sswitch_2
        0xb269699 -> :sswitch_1
        0x59ae0c65 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
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
