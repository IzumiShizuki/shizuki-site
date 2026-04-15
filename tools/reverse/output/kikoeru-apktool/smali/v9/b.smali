.class public abstract Lv9/b;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lub/p;

.field public static final b:Lub/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq9/j0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq9/j0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lv9/b;->a:Lub/p;

    .line 13
    .line 14
    new-instance v0, Lq9/j0;

    .line 15
    .line 16
    const/16 v1, 0x10

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lq9/j0;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lub/a;->d(Lic/a;)Lub/p;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lv9/b;->b:Lub/p;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method

.method public static final a(ILx0/o;)V
    .locals 8

    .line 1
    const v0, -0x55ce22e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    and-int/lit8 v3, p0, 0x1

    .line 15
    .line 16
    invoke-virtual {p1, v3, v2}, Lx0/o;->N(IZ)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_4

    .line 21
    .line 22
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    const v3, 0x1dd68e42

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v3}, Lx0/o;->W(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v4, Ljc/y;

    .line 35
    .line 36
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    const v5, 0x6e3c21fe

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v5}, Lx0/o;->W(I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    sget-object v6, Lx0/k;->a:Lx0/r0;

    .line 50
    .line 51
    if-ne v5, v6, :cond_1

    .line 52
    .line 53
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {v5}, Ljc/z;->a(Ljava/lang/Class;)Lpc/v;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const-string v7, "databaseModifyWarning"

    .line 60
    .line 61
    invoke-static {v7, v2, v3, v0, v5}, Llc/b;->G(Ljava/lang/String;Ljava/lang/Object;Lhg/a;ZLpc/v;)Lfg/f;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {p1, v5}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    check-cast v5, Lfg/f;

    .line 69
    .line 70
    invoke-virtual {p1, v1}, Lx0/o;->p(Z)V

    .line 71
    .line 72
    .line 73
    iput-object v5, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 74
    .line 75
    new-instance v0, La9/t;

    .line 76
    .line 77
    const/4 v2, 0x6

    .line 78
    invoke-direct {v0, v4, v2}, La9/t;-><init>(Ljc/y;I)V

    .line 79
    .line 80
    .line 81
    invoke-static {v5, v0, p1}, Lx0/v;->c(Ljava/lang/Object;Lic/k;Lx0/o;)V

    .line 82
    .line 83
    .line 84
    iget-object v0, v4, Ljc/y;->a:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Lfg/f;

    .line 87
    .line 88
    invoke-virtual {p1, v1}, Lx0/o;->p(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Lx0/o;->f(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    if-nez v1, :cond_2

    .line 100
    .line 101
    if-ne v2, v6, :cond_3

    .line 102
    .line 103
    :cond_2
    new-instance v2, Lla/q0;

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    const/4 v3, 0x1

    .line 107
    invoke-direct {v2, v0, v1, v3}, Lla/q0;-><init>(Lfg/f;Lyb/c;I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v2}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    check-cast v2, Lic/n;

    .line 114
    .line 115
    sget-object v0, Lub/a0;->a:Lub/a0;

    .line 116
    .line 117
    invoke-static {v2, v0, p1}, Lx0/v;->e(Lic/n;Ljava/lang/Object;Lx0/o;)V

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_4
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 122
    .line 123
    .line 124
    :goto_1
    invoke-virtual {p1}, Lx0/o;->r()Lx0/p1;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    new-instance v0, Lt2/x;

    .line 131
    .line 132
    const/16 v1, 0x1d

    .line 133
    .line 134
    invoke-direct {v0, p0, v1}, Lt2/x;-><init>(II)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p1, Lx0/p1;->d:Lic/n;

    .line 138
    .line 139
    :cond_5
    return-void
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

.method public static final b(ILx0/o;)V
    .locals 9

    .line 1
    const v0, -0x21c5d0d2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lx0/o;->Y(I)Lx0/o;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    and-int/lit8 v2, p0, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, v2, v1}, Lx0/o;->N(IZ)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-static {v0, p1}, Lv9/b;->a(ILx0/o;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lgg/c;->a()Lhg/a;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {p1}, Lx0/o;->K()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lx0/k;->a:Lx0/r0;

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    new-instance v0, Lt9/c;

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    invoke-direct {v0, v1}, Lt9/c;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lx0/o;->h0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    move-object v6, v0

    .line 46
    check-cast v6, Lic/k;

    .line 47
    .line 48
    const/16 v8, 0x6000

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    move-object v7, p1

    .line 54
    invoke-static/range {v2 .. v8}, Ly8/c;->c(Lhg/a;Lj1/q;FFLic/k;Lx0/o;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v7, p1

    .line 59
    invoke-virtual {v7}, Lx0/o;->Q()V

    .line 60
    .line 61
    .line 62
    :goto_1
    invoke-virtual {v7}, Lx0/o;->r()Lx0/p1;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    new-instance v0, Lt2/x;

    .line 69
    .line 70
    const/16 v1, 0x1c

    .line 71
    .line 72
    invoke-direct {v0, p0, v1}, Lt2/x;-><init>(II)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p1, Lx0/p1;->d:Lic/n;

    .line 76
    .line 77
    :cond_3
    return-void
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

.method public static final c()Ljava/io/File;
    .locals 1

    .line 1
    sget-object v0, Lv9/b;->a:Lub/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lub/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    return-object v0
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
