.class public abstract Lxf/c;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final d:Lxf/b;


# instance fields
.field public final a:Lxf/j;

.field public final b:Ld0/y;

.field public final c:Lxa/h;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lxf/b;

    .line 2
    .line 3
    new-instance v1, Lxf/j;

    .line 4
    .line 5
    const/4 v8, 0x1

    .line 6
    sget-object v9, Lxf/a;->b:Lxf/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const-string v5, "    "

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v7, "type"

    .line 15
    .line 16
    invoke-direct/range {v1 .. v9}, Lxf/j;-><init>(ZZZLjava/lang/String;ZLjava/lang/String;ZLxf/a;)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lzf/d;->a:Ld0/y;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Lxf/c;-><init>(Lxf/j;Ld0/y;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lxf/c;->d:Lxf/b;

    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
.end method

.method public constructor <init>(Lxf/j;Ld0/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxf/c;->a:Lxf/j;

    .line 5
    .line 6
    iput-object p2, p0, Lxf/c;->b:Ld0/y;

    .line 7
    .line 8
    new-instance p1, Lxa/h;

    .line 9
    .line 10
    const/4 p2, 0x3

    .line 11
    invoke-direct {p1, p2}, Lxa/h;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lxf/c;->c:Lxa/h;

    .line 15
    .line 16
    return-void
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
.method public final a(Ljava/lang/String;Lsf/a;)Ljava/lang/Object;
    .locals 7

    .line 1
    const-string v0, "deserializer"

    .line 2
    .line 3
    invoke-static {p2, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "string"

    .line 7
    .line 8
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lh7/k;

    .line 12
    .line 13
    invoke-direct {v4, p1}, Lh7/k;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lyf/s;

    .line 17
    .line 18
    invoke-interface {p2}, Lsf/a;->a()Luf/g;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const/4 v6, 0x0

    .line 23
    sget-object v3, Lyf/w;->c:Lyf/w;

    .line 24
    .line 25
    move-object v2, p0

    .line 26
    invoke-direct/range {v1 .. v6}, Lyf/s;-><init>(Lxf/c;Lyf/w;Lh7/k;Luf/g;Lapp/nekogram/translator/r;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Lyf/s;->d(Lsf/a;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {v4}, Lh7/k;->i()B

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0xa

    .line 38
    .line 39
    if-ne v0, v1, :cond_0

    .line 40
    .line 41
    return-object p2

    .line 42
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v0, "Expected EOF after parsing, but had "

    .line 45
    .line 46
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget v0, v4, Lh7/k;->b:I

    .line 50
    .line 51
    add-int/lit8 v0, v0, -0x1

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, " instead"

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const/4 p2, 0x0

    .line 70
    const/4 v0, 0x6

    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-static {v4, p1, p2, v1, v0}, Lh7/k;->q(Lh7/k;Ljava/lang/String;ILjava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    throw v1
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

.method public final b(Lsf/a;Ljava/lang/Object;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lb7/m;

    .line 7
    .line 8
    const/16 v1, 0xb

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, Lb7/m;-><init>(IC)V

    .line 12
    .line 13
    .line 14
    sget-object v1, Lyf/c;->c:Lyf/c;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    iget-object v2, v1, Lu3/v;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lvb/j;

    .line 20
    .line 21
    invoke-virtual {v2}, Lvb/j;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, 0x0

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    move-object v2, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {v2}, Lvb/j;->removeLast()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_0
    check-cast v2, [C

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    iget v3, v1, Lu3/v;->a:I

    .line 39
    .line 40
    array-length v4, v2

    .line 41
    sub-int/2addr v3, v4

    .line 42
    iput v3, v1, Lu3/v;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    move-object v4, v2

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    :goto_1
    monitor-exit v1

    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    const/16 v1, 0x80

    .line 52
    .line 53
    new-array v4, v1, [C

    .line 54
    .line 55
    :cond_2
    iput-object v4, v0, Lb7/m;->c:Ljava/lang/Object;

    .line 56
    .line 57
    :try_start_1
    new-instance v1, Lyf/t;

    .line 58
    .line 59
    sget-object v2, Lyf/w;->c:Lyf/w;

    .line 60
    .line 61
    sget-object v3, Lyf/w;->h:Lbc/b;

    .line 62
    .line 63
    invoke-virtual {v3}, Lbc/b;->a()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    new-array v3, v3, [Lyf/t;

    .line 68
    .line 69
    new-instance v4, Lk5/d;

    .line 70
    .line 71
    invoke-direct {v4, v0}, Lk5/d;-><init>(Lb7/m;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v4, p0, v2, v3}, Lyf/t;-><init>(Lk5/d;Lxf/c;Lyf/w;[Lyf/t;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, p1, p2}, Lyf/t;->s(Lsf/a;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lb7/m;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    invoke-virtual {v0}, Lb7/m;->u()V

    .line 85
    .line 86
    .line 87
    return-object p1

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    invoke-virtual {v0}, Lb7/m;->u()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :goto_2
    monitor-exit v1

    .line 94
    throw p1
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
