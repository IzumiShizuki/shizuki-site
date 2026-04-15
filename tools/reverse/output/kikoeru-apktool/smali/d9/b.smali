.class public final synthetic Ld9/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/k;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput p1, p0, Ld9/b;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ld9/b;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Ld9/b;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
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
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Ld9/b;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ld9/b;->b:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, v1, Ld9/b;->c:Ljava/lang/String;

    .line 11
    .line 12
    move-object/from16 v3, p1

    .line 13
    .line 14
    check-cast v3, Lz7/a;

    .line 15
    .line 16
    const-string v4, "_connection"

    .line 17
    .line 18
    invoke-static {v3, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v4, "SELECT * FROM BlacklistBean WHERE type=(?) AND value=(?)"

    .line 22
    .line 23
    invoke-interface {v3, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v4, 0x1

    .line 28
    :try_start_0
    invoke-interface {v3, v4, v0}, Lz7/c;->v(ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x2

    .line 32
    invoke-interface {v3, v0, v2}, Lz7/c;->v(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "id"

    .line 36
    .line 37
    invoke-static {v3, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const-string v2, "type"

    .line 42
    .line 43
    invoke-static {v3, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const-string v4, "value"

    .line 48
    .line 49
    invoke-static {v3, v4}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_0

    .line 58
    .line 59
    invoke-interface {v3, v0}, Lz7/c;->getLong(I)J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    long-to-int v0, v5

    .line 64
    invoke-interface {v3, v2}, Lz7/c;->M(I)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v3, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    new-instance v5, Lc9/b;

    .line 73
    .line 74
    invoke-direct {v5, v0, v2, v4}, Lc9/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_1

    .line 80
    :cond_0
    const/4 v5, 0x0

    .line 81
    :goto_0
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 82
    .line 83
    .line 84
    return-object v5

    .line 85
    :goto_1
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :pswitch_0
    iget-object v0, v1, Ld9/b;->b:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v2, v1, Ld9/b;->c:Ljava/lang/String;

    .line 92
    .line 93
    move-object/from16 v3, p1

    .line 94
    .line 95
    check-cast v3, Lz7/a;

    .line 96
    .line 97
    const-string v4, "_connection"

    .line 98
    .line 99
    invoke-static {v3, v4}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const-string v4, "SELECT * FROM AccountBean WHERE server=(?) AND username=(?)"

    .line 103
    .line 104
    invoke-interface {v3, v4}, Lz7/a;->d0(Ljava/lang/String;)Lz7/c;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    const/4 v4, 0x1

    .line 109
    :try_start_1
    invoke-interface {v3, v4, v0}, Lz7/c;->v(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 v0, 0x2

    .line 113
    invoke-interface {v3, v0, v2}, Lz7/c;->v(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const-string v0, "id"

    .line 117
    .line 118
    invoke-static {v3, v0}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    const-string v2, "server"

    .line 123
    .line 124
    invoke-static {v3, v2}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    const-string v4, "username"

    .line 129
    .line 130
    invoke-static {v3, v4}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    const-string v5, "password"

    .line 135
    .line 136
    invoke-static {v3, v5}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    const-string v6, "token"

    .line 141
    .line 142
    invoke-static {v3, v6}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    const-string v7, "timestamp"

    .line 147
    .line 148
    invoke-static {v3, v7}, Lvb/w;->j(Lz7/c;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    invoke-interface {v3}, Lz7/c;->Z()Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_1

    .line 157
    .line 158
    invoke-interface {v3, v0}, Lz7/c;->getLong(I)J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    long-to-int v11, v8

    .line 163
    invoke-interface {v3, v2}, Lz7/c;->M(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-interface {v3, v4}, Lz7/c;->M(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    invoke-interface {v3, v5}, Lz7/c;->M(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v14

    .line 175
    invoke-interface {v3, v6}, Lz7/c;->M(I)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    invoke-interface {v3, v7}, Lz7/c;->getLong(I)J

    .line 180
    .line 181
    .line 182
    move-result-wide v16

    .line 183
    new-instance v10, Lc9/a;

    .line 184
    .line 185
    invoke-direct/range {v10 .. v17}, Lc9/a;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :catchall_1
    move-exception v0

    .line 190
    goto :goto_3

    .line 191
    :cond_1
    const/4 v10, 0x0

    .line 192
    :goto_2
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 193
    .line 194
    .line 195
    return-object v10

    .line 196
    :goto_3
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
