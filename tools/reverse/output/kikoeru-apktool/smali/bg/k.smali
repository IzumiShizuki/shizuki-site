.class public final Lbg/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lsf/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 6

    .line 1
    iput p1, p0, Lbg/k;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    new-array p1, p1, [Luf/g;

    .line 11
    .line 12
    const-string v1, "MixedSerializer"

    .line 13
    .line 14
    invoke-static {v1}, Lef/n;->y0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v5, Luf/a;

    .line 21
    .line 22
    invoke-direct {v5, v1}, Luf/a;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Luf/h;

    .line 26
    .line 27
    sget-object v2, Luf/k;->b:Luf/k;

    .line 28
    .line 29
    iget-object v3, v5, Luf/a;->c:Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {p1}, Lvb/l;->M0([Ljava/lang/Object;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-direct/range {v0 .. v5}, Luf/h;-><init>(Ljava/lang/String;Lud/n;ILjava/util/List;Luf/a;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lbg/k;->b:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string v0, "Blank serial names are prohibited"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance p1, Lt9/f;

    .line 57
    .line 58
    const/4 v0, 0x6

    .line 59
    invoke-direct {p1, v0, p0}, Lt9/f;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lub/i;->a:Lub/i;

    .line 63
    .line 64
    invoke-static {v0, p1}, Lub/a;->c(Lub/i;Lic/a;)Lub/h;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lbg/k;->b:Ljava/lang/Object;

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    new-array p1, p1, [Luf/g;

    .line 76
    .line 77
    const-string v1, "PPP"

    .line 78
    .line 79
    invoke-static {v1}, Lef/n;->y0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    new-instance v5, Luf/a;

    .line 86
    .line 87
    invoke-direct {v5, v1}, Luf/a;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    new-instance v0, Luf/h;

    .line 91
    .line 92
    sget-object v2, Luf/k;->b:Luf/k;

    .line 93
    .line 94
    iget-object v3, v5, Luf/a;->c:Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {p1}, Lvb/l;->M0([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-direct/range {v0 .. v5}, Luf/h;-><init>(Ljava/lang/String;Lud/n;ILjava/util/List;Luf/a;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lbg/k;->b:Ljava/lang/Object;

    .line 108
    .line 109
    return-void

    .line 110
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 111
    .line 112
    const-string v0, "Blank serial names are prohibited"

    .line 113
    .line 114
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method


# virtual methods
.method public final a()Luf/g;
    .locals 1

    .line 1
    iget v0, p0, Lbg/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbg/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-interface {v0}, Lub/h;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Luf/g;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lbg/k;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Luf/h;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_1
    iget-object v0, p0, Lbg/k;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Luf/h;

    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final b(Lvf/b;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lbg/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lbg/k;->a()Luf/g;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {p1, v0}, Lvf/b;->i(Luf/g;)Lvf/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0}, Lbg/k;->a()Luf/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p1, v1}, Lvf/a;->b(Luf/g;)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, -0x1

    .line 23
    if-ne v1, v2, :cond_0

    .line 24
    .line 25
    invoke-interface {p1, v0}, Lvf/a;->j(Luf/g;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance p1, Lsf/h;

    .line 32
    .line 33
    const-string v0, "Unexpected index "

    .line 34
    .line 35
    invoke-static {v1, v0}, Lq/t0;->B(ILjava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :pswitch_0
    check-cast p1, Lxf/k;

    .line 44
    .line 45
    invoke-interface {p1}, Lxf/k;->l()Lxf/m;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lxf/n;->e(Lxf/m;)Lxf/y;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "currentPage"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lxf/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Lxf/m;

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    const-string v0, "page"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Lxf/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lxf/m;

    .line 70
    .line 71
    :cond_1
    invoke-static {v0}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lxf/n;->f(Lxf/m;)Lxf/c0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lxf/n;->d(Lxf/c0;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const-string v1, "pageSize"

    .line 83
    .line 84
    invoke-virtual {p1, v1}, Lxf/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    check-cast v1, Lxf/m;

    .line 92
    .line 93
    invoke-static {v1}, Lxf/n;->f(Lxf/m;)Lxf/c0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, Lxf/n;->d(Lxf/c0;)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    const-string v2, "totalCount"

    .line 102
    .line 103
    invoke-virtual {p1, v2}, Lxf/y;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {p1}, Ljc/l;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    check-cast p1, Lxf/m;

    .line 111
    .line 112
    invoke-static {p1}, Lxf/n;->f(Lxf/m;)Lxf/c0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Lxf/n;->d(Lxf/c0;)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    new-instance v2, Lbg/m;

    .line 121
    .line 122
    invoke-direct {v2, v0, v1, p1}, Lbg/m;-><init>(III)V

    .line 123
    .line 124
    .line 125
    return-object v2

    .line 126
    :pswitch_1
    check-cast p1, Lxf/k;

    .line 127
    .line 128
    invoke-interface {p1}, Lxf/k;->l()Lxf/m;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p1}, Lxf/n;->f(Lxf/m;)Lxf/c0;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Lxf/n;->c(Lxf/c0;)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_2

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    goto :goto_2

    .line 147
    :cond_2
    const/4 v0, 0x0

    .line 148
    :try_start_0
    invoke-static {p1}, Lxf/n;->g(Lxf/c0;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v1

    .line 152
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object p1
    :try_end_0
    .catch Lyf/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    goto :goto_0

    .line 157
    :catch_0
    nop

    .line 158
    move-object p1, v0

    .line 159
    :goto_0
    if-eqz p1, :cond_3

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 162
    .line 163
    .line 164
    move-result-wide v1

    .line 165
    const-wide/32 v3, -0x80000000

    .line 166
    .line 167
    .line 168
    cmp-long p1, v3, v1

    .line 169
    .line 170
    if-gtz p1, :cond_3

    .line 171
    .line 172
    const-wide/32 v3, 0x7fffffff

    .line 173
    .line 174
    .line 175
    cmp-long p1, v1, v3

    .line 176
    .line 177
    if-gtz p1, :cond_3

    .line 178
    .line 179
    long-to-int p1, v1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    :cond_3
    if-nez v0, :cond_4

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_5

    .line 192
    .line 193
    :goto_1
    const/4 p1, 0x1

    .line 194
    goto :goto_2

    .line 195
    :cond_5
    const/4 p1, 0x0

    .line 196
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    return-object p1

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
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

.method public final d(Lyf/t;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lbg/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lbg/k;->a()Luf/g;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, Lyf/t;->a(Luf/g;)Lyf/t;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0}, Lbg/k;->a()Luf/g;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Lyf/t;->w(Luf/g;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    check-cast p2, Lbg/m;

    .line 28
    .line 29
    const-string v0, "value"

    .line 30
    .line 31
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, Lxf/y;->Companion:Lxf/x;

    .line 35
    .line 36
    invoke-virtual {v0}, Lxf/x;->serializer()Lsf/a;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lsf/a;

    .line 41
    .line 42
    new-instance v1, Li4/d;

    .line 43
    .line 44
    const/4 v2, 0x5

    .line 45
    invoke-direct {v1, v2}, Li4/d;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iget v2, p2, Lbg/m;->a:I

    .line 49
    .line 50
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const-string v3, "currentPage"

    .line 55
    .line 56
    invoke-static {v1, v3, v2}, Lud/s;->v(Li4/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 57
    .line 58
    .line 59
    iget v2, p2, Lbg/m;->b:I

    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "pageSize"

    .line 66
    .line 67
    invoke-static {v1, v3, v2}, Lud/s;->v(Li4/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 68
    .line 69
    .line 70
    iget p2, p2, Lbg/m;->c:I

    .line 71
    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    const-string v2, "totalCount"

    .line 77
    .line 78
    invoke-static {v1, v2, p2}, Lud/s;->v(Li4/d;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Li4/d;->c()Lxf/y;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p1, v0, p2}, Lyf/t;->s(Lsf/a;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :pswitch_1
    check-cast p2, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    invoke-virtual {p1, p2}, Lyf/t;->b(Z)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
